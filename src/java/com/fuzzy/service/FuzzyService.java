/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fuzzy.service;

import com.fuzzy.service.ModifiedFuzzy.ModifiedFuzzyCalculator;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

/**
 *
 * @author Marvin Zeson
 */
@WebService(serviceName = "FuzzyService")
public class FuzzyService {


    /**
     * Web service operation
     * @param querry
     * @return 
     */
    @WebMethod(operationName = "doSearch")
    public List<TfIdfWithArticleIndex> doSearch(@WebParam(name = "querry") String querry) throws JAXBException{
        //TODO write your implementation code here:
        JAXBContext context = JAXBContext.newInstance(TfIdfWithArticleIndex.class);
        List<List<String>> documents = new ArrayList<>();
        List<String> documentToken = new ArrayList<>();
            
        List<List<String>> titles = new ArrayList<>();
        List<String> title = new ArrayList<>();
        List<String> coba = new ArrayList<>();
        
        List<String> titleCollection = new ArrayList<>();
        List<String> contentCollection = new ArrayList<>();
            
        List<String> stopWord = Arrays.asList("ada", "adalah", "adanya", "adapun", "agak", "agaknya", "agar", "akan", "akankah", "akhir", "akhiri", "akhirnya", "aku", "akulah", "amat", "amatlah", "anda", "andalah", "antar", "antara", "antaranya", "apa", "apaan", "apabila", "apakah", "apalagi", "apatah", "artinya", "asal", "asalkan", "atas", "atau", "ataukah", "ataupun", "awal", "awalnya", "bagai", "bagaikan", "bagaimana", "bagaimanakah", "bagaimanapun", "bagi", "bagian", "bahkan", "bahwa", "bahwasanya", "baik", "bakal", "bakalan", "balik", "banyak", "bapak", "baru", "bawah", "beberapa", "begini", "beginian", "beginikah", "beginilah", "begitu", "begitukah", "begitulah", "begitupun", "bekerja", "belakang", "belakangan", "belum", "belumlah", "benar", "benarkah", "benarlah", "berada", "berakhir", "berakhirlah", "berakhirnya", "berapa", "berapakah", "berapalah", "berapapun", "berarti", "berawal", "berbagai", "berdatangan", "beri", "berikan", "berikut", "berikutnya", "berjumlah", "berkali-kali", "berkata", "berkehendak", "berkeinginan", "berkenaan", "berlainan", "berlalu", "berlangsung", "berlebihan", "bermacam", "bermacam-macam", "bermaksud", "bermula", "bersama", "bersama-sama", "bersiap", "bersiap-siap", "bertanya", "bertanya-tanya", "berturut", "berturut-turut", "bertutur", "berujar", "berupa", "besar", "betul", "betulkah", "biasa", "biasanya", "bila", "bilakah", "bisa", "bisakah", "boleh", "bolehkah", "bolehlah", "buat", "bukan", "bukankah", "bukanlah", "bukannya", "bulan", "bung", "cara", "caranya", "cukup", "cukupkah", "cukuplah", "cuma", "dahulu", "dalam", "dan", "dapat", "dari", "daripada", "datang", "dekat", "demi", "demikian", "demikianlah", "dengan", "depan", "di", "dia", "diakhiri", "diakhirinya", "dialah", "diantara", "diantaranya", "diberi", "diberikan", "diberikannya", "dibuat", "dibuatnya", "didapat", "didatangkan", "digunakan", "diibaratkan", "diibaratkannya", "diingat", "diingatkan", "diinginkan", "dijawab", "dijelaskan", "dijelaskannya", "dikarenakan", "dikatakan", "dikatakannya", "dikerjakan", "diketahui", "diketahuinya", "dikira", "dilakukan", "dilalui", "dilihat", "dimaksud", "dimaksudkan", "dimaksudkannya", "dimaksudnya", "diminta", "dimintai", "dimisalkan", "dimulai", "dimulailah", "dimulainya", "dimungkinkan", "dini", "dipastikan", "diperbuat", "diperbuatnya", "dipergunakan", "diperkirakan", "diperlihatkan", "diperlukan", "diperlukannya", "dipersoalkan", "dipertanyakan", "dipunyai", "diri", "dirinya", "disampaikan", "disebut", "disebutkan", "disebutkannya", "disini", "disinilah", "ditambahkan", "ditandaskan", "ditanya", "ditanyai", "ditanyakan", "ditegaskan", "ditujukan", "ditunjuk", "ditunjuki", "ditunjukkan", "ditunjukkannya", "ditunjuknya", "dituturkan", "dituturkannya", "diucapkan", "diucapkannya", "diungkapkan", "dong", "dua", "dulu", "empat", "enggak", "enggaknya", "entah", "entahlah", "guna", "gunakan", "hal", "hampir", "hanya", "hanyalah", "hari", "harus", "haruslah", "harusnya", "hendak", "hendaklah", "hendaknya", "hingga", "ia", "ialah", "ibarat", "ibaratkan", "ibaratnya", "ibu", "ikut", "ingat", "ingat-ingat", "ingin", "inginkah", "inginkan", "ini", "inikah", "inilah", "itu", "itukah", "itulah", "jadi", "jadilah", "jadinya", "jangan", "jangankan", "janganlah", "jauh", "jawab", "jawaban", "jawabnya", "jelas", "jelaskan", "jelaslah", "jelasnya", "jika", "jikalau", "juga", "jumlah", "jumlahnya", "justru", "kala", "kalau", "kalaulah", "kalaupun", "kalian", "kami", "kamilah", "kamu", "kamulah", "kan", "kapan", "kapankah", "kapanpun", "karena", "karenanya", "kasus", "kata", "katakan", "katakanlah", "katanya", "ke", "keadaan", "kebetulan", "kecil", "kedua", "keduanya", "keinginan", "kelamaan", "kelihatan", "kelihatannya", "kelima", "keluar", "kembali", "kemudian", "kemungkinan", "kemungkinannya", "kenapa", "kepada", "kepadanya", "kesampaian", "keseluruhan", "keseluruhannya", "keterlaluan", "ketika", "khususnya", "kini", "kinilah", "kira", "kira-kira", "kiranya", "kita", "kitalah", "kok", "kurang", "lagi", "lagian", "lah", "lain", "lainnya", "lalu", "lama", "lamanya", "lanjut", "lanjutnya", "lebih", "lewat", "lima", "luar", "macam", "maka", "makanya", "makin", "malah", "malahan", "mampu", "mampukah", "mana", "manakala", "manalagi", "masa", "masalah", "masalahnya", "masih", "masihkah", "masing", "masing-masing", "mau", "maupun", "melainkan", "melakukan", "melalui", "melihat", "melihatnya", "memang", "memastikan", "memberi", "memberikan", "membuat", "memerlukan", "memihak", "meminta", "memintakan", "memisalkan", "memperbuat", "mempergunakan", "memperkirakan", "memperlihatkan", "mempersiapkan", "mempersoalkan", "mempertanyakan", "mempunyai", "memulai", "memungkinkan", "menaiki", "menambahkan", "menandaskan", "menanti", "menanti-nanti", "menantikan", "menanya", "menanyai", "menanyakan", "mendapat", "mendapatkan", "mendatang", "mendatangi", "mendatangkan", "menegaskan", "mengakhiri", "mengapa", "mengatakan", "mengatakannya", "mengenai", "mengerjakan", "mengetahui", "menggunakan", "menghendaki", "mengibaratkan", "mengibaratkannya", "mengingat", "mengingatkan", "menginginkan", "mengira", "mengucapkan", "mengucapkannya", "mengungkapkan", "menjadi", "menjawab", "menjelaskan", "menuju", "menunjuk", "menunjuki", "menunjukkan", "menunjuknya", "menurut", "menuturkan", "menyampaikan", "menyangkut", "menyatakan", "menyebutkan", "menyeluruh", "menyiapkan", "merasa", "mereka", "merekalah", "merupakan", "meski", "meskipun", "meyakini", "meyakinkan", "minta", "mirip", "misal", "misalkan", "misalnya", "mula", "mulai", "mulailah", "mulanya", "mungkin", "mungkinkah", "nah", "naik", "namun", "nanti", "nantinya", "nyaris", "nyatanya", "oleh", "olehnya", "pada", "padahal", "padanya", "pak", "paling", "panjang", "pantas", "para", "pasti", "pastilah", "penting", "pentingnya", "per", "percuma", "perlu", "perlukah", "perlunya", "pernah", "persoalan", "pertama", "pertama-tama", "pertanyaan", "pertanyakan", "pihak", "pihaknya", "pukul", "pula", "pun", "punya", "rasa", "rasanya", "rata", "rupanya", "saat", "saatnya", "saja", "sajalah", "saling", "sama", "sama-sama", "sambil", "sampai", "sampai-sampai", "sampaikan", "sana", "sangat", "sangatlah", "satu", "saya", "sayalah", "se", "sebab", "sebabnya", "sebagai", "sebagaimana", "sebagainya", "sebagian", "sebaik", "sebaik-baiknya", "sebaiknya", "sebaliknya", "sebanyak", "sebegini", "sebegitu", "sebelum", "sebelumnya", "sebenarnya", "seberapa", "sebesar", "sebetulnya", "sebisanya", "sebuah", "sebut", "sebutlah", "sebutnya", "secara", "secukupnya", "sedang", "sedangkan", "sedemikian", "sedikit", "sedikitnya", "seenaknya", "segala", "segalanya", "segera", "seharusnya", "sehingga", "seingat", "sejak", "sejauh", "sejenak", "sejumlah", "sekadar", "sekadarnya", "sekali", "sekali-kali", "sekalian", "sekaligus", "sekalipun", "sekarang", "sekarang", "sekecil", "seketika", "sekiranya", "sekitar", "sekitarnya", "sekurang-kurangnya", "sekurangnya", "sela", "selain", "selaku", "selalu", "selama", "selama-lamanya", "selamanya", "selanjutnya", "seluruh", "seluruhnya", "semacam", "semakin", "semampu", "semampunya", "semasa", "semasih", "semata", "semata-mata", "semaunya", "sementara", "semisal", "semisalnya", "sempat", "semua", "semuanya", "semula", "sendiri", "sendirian", "sendirinya", "seolah", "seolah-olah", "seorang", "sepanjang", "sepantasnya", "sepantasnyalah", "seperlunya", "seperti", "sepertinya", "sepihak", "sering", "seringnya", "serta", "serupa", "sesaat", "sesama", "sesampai", "sesegera", "sesekali", "seseorang", "sesuatu", "sesuatunya", "sesudah", "sesudahnya", "setelah", "setempat", "setengah", "seterusnya", "setiap", "setiba", "setibanya", "setidak-tidaknya", "setidaknya", "setinggi", "seusai", "sewaktu", "siap", "siapa", "siapakah", "siapapun", "sini", "sinilah", "soal", "soalnya", "suatu", "sudah", "sudahkah", "sudahlah", "supaya", "tadi", "tadinya", "tahu", "tahun", "tak", "tambah", "tambahnya", "tampak", "tampaknya", "tandas", "tandasnya", "tanpa", "tanya", "tanyakan", "tanyanya", "tapi", "tegas", "tegasnya", "telah", "tempat", "tengah", "tentang", "tentu", "tentulah", "tentunya", "tepat", "terakhir", "terasa", "terbanyak", "terdahulu", "terdapat", "terdiri", "terhadap", "terhadapnya", "teringat", "teringat-ingat", "terjadi", "terjadilah", "terjadinya", "terkira", "terlalu", "terlebih", "terlihat", "termasuk", "ternyata", "tersampaikan", "tersebut", "tersebutlah", "tertentu", "tertuju", "terus", "terutama", "tetap", "tetapi", "tiap", "tiba", "tiba-tiba", "tidak", "tidakkah", "tidaklah", "tiga", "tinggi", "toh", "tunjuk", "turut", "tutur", "tuturnya", "ucap", "ucapnya", "ujar", "ujarnya", "umum", "umumnya", "ungkap", "ungkapnya", "untuk", "usah", "usai", "waduh", "wah", "wahai", "waktu", "waktunya", "walau", "walaupun", "wong", "yaitu", "yakin", "yakni", "yang");

        MyDBConnection mdbc = new MyDBConnection();
        mdbc.init();
        Connection conn = mdbc.getMyConnection();
        java.sql.Statement stmt = null;
        ResultSet rs = null;
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT id, judul, isi FROM artikel ORDER BY id ASC");
        } catch (SQLException ex) {
            Logger.getLogger(FuzzyService.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            while(rs.next()){
                String documentTitle = rs.getString("judul");
                String documentContent = rs.getString("isi");
                titleCollection.add(documentTitle);
                contentCollection.add(documentContent.substring(0, Math.min(documentContent.length(), 50)));
                
                
                documentToken = new ArrayList<>();
                title = new ArrayList<>();
                
                StringTokenizer contentTokenizer = new StringTokenizer(
                        documentContent, " !@#$%^&*()-_=+|;:',.\"/<>?");
                while (contentTokenizer.hasMoreTokens()) {
                    String tmpContent = contentTokenizer.nextToken();
                    if(stopWord.contains(tmpContent.toLowerCase())){
                        continue;
                    }
                    documentToken.add(tmpContent.toLowerCase());
                }
                
                StringTokenizer titleTokenizer = new StringTokenizer(
                        documentTitle, " !@#$%^&*()-_=+|;:',.\"/<>?");
                while (titleTokenizer.hasMoreTokens()) {
                    String tmpTitle = titleTokenizer.nextToken();
                    if(stopWord.contains(tmpTitle.toLowerCase())){
                        continue;
                    }
                    title.add(tmpTitle.toLowerCase());
                }
                
                documents.add(documentToken);
                titles.add(title);
            }
        } catch (SQLException ex) {
            Logger.getLogger(FuzzyService.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String inputUser = querry;
        ArrayList<String> query = new ArrayList<>();
        StringTokenizer queryTokenizer = new StringTokenizer(inputUser, " \"!@#$%^&*()-_=+|;:',./<>?");
        while (queryTokenizer.hasMoreTokens()) {
            query.add(queryTokenizer.nextToken());
                }
                
        ArrayList<String> tfIdf = new ArrayList();
        int i = 0;
        ModifiedFuzzyCalculator calculator = new ModifiedFuzzyCalculator();
        while (i < documents.size()) {
            int j = 0;
            double tfIdfValue = 0;
            double titleValue = 0;
            while (j < query.size()) {
                tfIdfValue += calculator.calculate(documents.get(i), documents, query.get(j), query);
                titleValue += calculator.calculate(titles.get(i), titles, query.get(j), query);
                j++;//increment
            }
            tfIdfValue = tfIdfValue / query.size();
            titleValue = titleValue / query.size();
            tfIdfValue = ((5 * tfIdfValue) + (5 * titleValue))/10;

            String tfIdfValueString = String.valueOf(tfIdfValue);
            tfIdf.add(tfIdfValueString);
            i++;
        }
        
        ArrayList<TfIdfWithArticleIndex> arrayToSort = new ArrayList<TfIdfWithArticleIndex>();
                i = 0;
                while (i < tfIdf.size()) {
                    TfIdfWithArticleIndex tempOfTfIdf = new TfIdfWithArticleIndex(i, tfIdf.get(i), titleCollection.get(i), contentCollection.get(i));
                    arrayToSort.add(tempOfTfIdf);
                    i++;
                }
                i = 0;
                
                i = 0;
                while (i < arrayToSort.size()) {
                    int j = i + 1;
                    while (j < arrayToSort.size()) {
                        if (arrayToSort.get(i).compareWith(arrayToSort.get(j)) < 0) {
                            TfIdfWithArticleIndex tempOfTfIdf = arrayToSort.get(i);
                            arrayToSort.set(i, arrayToSort.get(j));
                            arrayToSort.set(j, tempOfTfIdf);
                        }

                        j++;
                    }

                    i++;
                }
                
                i = 0;
                List<TfIdfWithArticleIndex> searchResult = new ArrayList<>();
                while (i < tfIdf.size()) {
                    if (arrayToSort.get(i).getArticleTfIdf().equals("0.0")) {
                        break;
                    } 
                    else if(i == 20){
                        break;
                    }
                    else {
                        searchResult.add(arrayToSort.get(i));
                    }
                    i++;
                }
                
        mdbc.close(stmt);
        mdbc.destroy();
        return searchResult;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "coba")
    public TfIdfWithArticleIndex coba(@WebParam(name = "query") String query) {
        TfIdfWithArticleIndex article = new TfIdfWithArticleIndex(1, "0.5", "Ini Budi", "Budi bermain bola");
        
        return article;
    }
}
