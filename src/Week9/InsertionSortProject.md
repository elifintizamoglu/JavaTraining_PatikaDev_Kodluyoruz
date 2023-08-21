# Soru 1:

### [22,27,16,2,18,6] -> Insertion Sort / Verilen dizinin sort türüne göre aşamalarını yazınız.

>Insertion sort : Algoritmada, ikinci elemandan başlayarak 
elemanın kendinden önceki elemanlarla karşılaştırılması suretiyle büyük 
elemanlar dizide sağa doğru kaydırılır. Böylelikle açılan uygun pozisyona o anda 
sıralanmakta olan eleman yerleştirilir.

1. Adım (27 için): 22 **27** 16 2 18 6
2. Adım (16 için): **16** 22 27 2 18 6
3. Adım (2 için) : **2** 16 22 27 18 6
4. Adım (18 için): 2 16 **18** 22 27 6
5. Adım (6 için) : 2 **6** 16 18 22 27

*Zaman karmaşıklığı O(n^2) çünkü 
en kötü durumda her elemanı sıralanmış bölgeye yerleştirirken O(n) 
kadar kaydırma yapılması gerekebilir ve bunu tüm elemanlar için yaparsak 
toplam işlem sayısı O(n) * O(n) = O(n^2) olur.*

### Dizi sıralandıktan sonra 18 sayısı aşağıdaki case'lerden hangisinin kapsamına girer?
Average case kapsamına girer.

---------------------------------

# Soru 2:

### [7,3,5,8,2,9,4,15,6] dizisinin Selection Sort'a göre ilk 4 adımını yazınız.

1. Adım: 2 7 3 5 8 9 4 15 6
2. Adım: 2 3 7 5 8 9 4 15 6
3. Adım: 2 3 4 7 5 8 9 15 6
4. Adım: 2 3 4 5 7 8 9 15 6