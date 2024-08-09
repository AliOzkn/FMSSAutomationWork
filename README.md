### Dizayn

- <b> pages</b> klasöründe sayfalardaki elementlerin locatelerinin bulunduğu sınıflar;
- <b> runner </b> klasöründe JUnit ile testleri koşmamızı sağlayanRrunner sınıfı;
- <b> stepDefinitions </b> Klasöründe test methdlarının bulunduğu sınıflar;
- <b> utility </b> Klasöründe driver'ı başlattığm ve kapattığım metodlar;
- <b> features </b> Klasöründe ise senaryoların yer aldığı cucumber feature dosyaları yer almaktadır.

### Notlar

- Başarılı login senaryosunda kullanılan step ler, birebir aynı şekilde Search senaryolarında <b> Background </b> olarak kullanılarak, gereksiz kod tekrarından kaçınıldı.
- Driver sınıfında static bir WebDriver tanımlanarak, import özelliği yardımıyla diğer sınıflarda basitce kullanılabilmesi sağlandı.
- Hooks sınıfı ile her testten önce ve sonra çalışması istenen durumlar belirlendi.
- Runner sınıfında CucumberOption'a eklenen plugin ile html formatında bir rapor oluşturuldu.
- "pages" klasörü altındaki sınıflar kalıtım yoluyla (extend) test sınıflarında çağrılarak elementlere kolayca ulaşılması sağlandı.