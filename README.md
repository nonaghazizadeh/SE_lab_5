# آزمایش پنجم آزمایشگاه مهندسی نرم‌افزار
## توضیحات آزمایش


<p align="justify">
در این آزمایش ما با استفاده از روش TDD ابتدا تست‌ها را پیاده‌سازی می‌کنیم و سپس از روی آنها کد موردنظر را پیاده‌سازی می‌کنیم. بنابراین ما
 نخست با تعریف کردن کلاس Rectangle مستطیل خود را می‌سازیم و برای آن متدی تعریف می‌کنیم تا با set کردن طول و عرض بتواند با متد computeArea مساحت خود را حساب کند.
در اینجا تست ما برای داشتن یک Rectangle و حساب کردن مساحت آن و تعیین طول عرض به خوبی کار می‌کند.
حال ما یک کلاس به نام Square تعریف کردیم که از Rectangle ارث می‌برد. مشکل این بود که اگر می‌خواهد دقیقا مشخصات parent خود را داشته باشد می‌توان طول و عرض جدا به آن داد. حال اگر بگوییم که ما if می‌گذاریم تا در صورت set شدن هر کدام از مقادیر اون یکی هم set کند شاید در این لحظه مشکل را برطرف کرده باشیم، اما طبق سناریوهای مختلف که برای توسعه نرم‌افزار پیش می‌آید باید چندین و چند if دیگر نیز بگذاریم. و این ها باعث می‌شود که اصل LSP برهم بخورد. همچنین در صورتی که یکی از افراد دیگر نیز به این کد وابسته بوده باشد با هر کدام از این ifها فهم قبلی اکتورهای مربوط دیگر نیز تغییر کرده و به آن‌ها نیز باید توضیح داده شود.
برای درست کردن آن ابتدا ما یک کلاس ابسترکت به اسم Shape درست کردیم که هم Rectangle و هم Square از آن ارث بری می‌کنند که متد computeArea را باید پیاده‌سازی کنند.
بعد از این داخل کلاس Square یک متغیر به نام edge تعریف شده است که همان تنها برای مربع باید set شود. اینگونه با abstrct کردن متد computeArea مشکلات برنامه قبلی رفع می‌شود و تست‌های ما بدون مشکل پاس می‌شوند.
</p>

## مراحل انجام آزمایش

<p align="justify">
همانطور که گفته شده است ابتدا تست‌ها برای کلاس Rectangle را پیاده‌سازی می‌کنیم. با پیاده‌سازی تست‌ها و اجرای آن برنامه ما به خطای کامپایلی خورد زیرا هنوز کدی پیاده‌سازی نشده است. مانند تصویر
زیر:
</p>

![](https://user-images.githubusercontent.com/59199865/236396492-7e56d636-cb51-49de-bf34-5998e83182ea.png)

<p align="justify">
همانطور که گفته شده است ابتدا تست‌ها برای کلاس Square را پیاده‌سازی می‌کنیم. با پیاده‌سازی تست‌ها و اجرای آن برنامه ما به خطای کامپایلی خورد زیرا هنوز کدی پیاده‌سازی نشده است. مانند تصویر
زیر:
</p>

![](https://user-images.githubusercontent.com/59199865/236396876-850810f6-0b92-419a-b440-4ca51da87ad8.png)
<p align="justify">
لازم به ذکر است برای پیاده‌سازی دو کلاس Rectangle و Square در ابتدا از اصول شی‌گرایی استفاده نکردیم. پس از پیاده‌سازی کامل
دو کلاس، کلاس Shape را مطابق با توضیحات گفته شده و مبتنی بر اصول شی‌گرایی 
پیاده‌سازی کردیم و بعد از اجرای پروژه با پیاده‌سازی کد‌ها تمام تست‌ها پاس می‌شود و داریم:
</p>

![](https://user-images.githubusercontent.com/59199865/236397972-25fd88fd-4234-4cba-a19f-0971e8ece365.png)

## پرسش‌ها
### سوال ۱
<p dir="rtl" align="justify">
<i>
Single Responsibility Principle (اصل اول)
</i>
این اصل به معنای این است که هر کلاس باید تنها یک دلیل برای تغییر داشته باشد یعنی اکتورهای متفاوتی از تغییر یک کلاس محبور به adapt شدن نشوند.
</p>
<p dir="rtl" align="justify">
<i>
Open-Closed Principle (اصل دوم)
</i>
کلاس‌ها 
همیشه برای extension باز هستند و برای modification بسته هستند.
بنابراین
ما باید بتوانیم بدون دست زدن به کد موجود برای کلاس، عملکرد جدیدی اضافه کنیم. این
به این دلیل است که هر زمان که کد موجود را اصلاح می کنیم، خطر ایجاد اشکالات احتمالی را می پذیریم. بنابراین 
در صورت امکان باید از دست زدن به کد آزمایش شده و قابل اعتماد production خودداری کنیم.
</p>
<p dir="rtl" align="justify">
<i>
Liskov Substitution Principle (اصل سوم)
</i>
هر child باید با parent خود رابطه is-A داشته باشد. یعنی هر متدی در child نباید pre-condition قوی‌تری
داشته باشد و نباید post-condition آن قوی‌تر باشد. یعنی کارهایی که پدر میکند
را باید بکند و نباید نپذیرد و همچنین باید کارهای اضافه‌تری که لازم است child بکند، را نیز انجام دهد.
</p>

<p dir="rtl" align="justify">
<i>
Interface Segregation Principle (اصل چهارم)
</i>
این اصل به ما می‌گوید که درست کردن چند interface بهتر از این است که یک اینترفیس بزرگ
همه کاره داشته باشیم. به بیانی دیگر این مانند god class درست کردن است و باعث می‌شود نتوانیم کلاس‌هایی را از اینترفیس‌هایی پیاده سازی کنیم
و همه چیز را باید در همه کلاس‌ها
با ایمپلیمنت کردن اینترفیس پیاده سازی کنیم. به بیانی دیگر
این اصل بیان می‌کند که بسیاری از اینترفیس‌های client-spesific بهتر
از یک اینترفیس general-purpose هستند. کلاینت‌ها نباید مجبور شوند تا عملکردی را که به آن نیازی ندارند، پیاده‌سازی کنند.
</p>

<p dir="rtl" align="justify">
<i>
Dependency Inversion Principle  (اصل پنجم)
</i>
منظور از این اصل این است که کلاس‌ها را بر اساس abstraction با هم تعامل کنند بهتر است. این خوب نیست که
در یک کلاس به طور مستقیم از یک کلاس دیگر instance وجود داشته باشد و coupling بالا رود.
به بیانی دیگر کلاس‌های ما باید به جای کلاس‌ها و توابع مشخص به اینترفیس‌ها یا کلاس‌های انتزاعی وابسته باشند.
</p>

### سوال ۲
<p align="justify" dir="rtl">
این اصول بیشتر
در گام تحلیل
در ذهن باید شکل بگیرند. این اصول باید وقتی داریم کدمان را تحلیل میکنیم و ارتباط بین classها را در میاوریم در ذهن ما حواسمان بهش باشند 
و بعدا ما بتوانیم آن‌ها را در بخش 
طراحی به کار بگیریم.
</p>

### سوال ۳
<p align="justify">
خیر تناقضی ندارد. نوشتن تست در ابتدای کار به برنامه‌نویس
این امکان را می‌دهد که بر اساس تست‌های نوشته شده کد خود را بنویسد و این دید باز نسبت
به نیاز‌های مسئله کمک می‌کند که کد‌نویسی نیز سریع‌تر و کم‌هزینه‌تر شود.
در مدل سنتی اما تست‌ها بعد از develope کد نوشته می‌شد که این نیز روشی هست که ما از صحت کد خود 
با خبر می‌شویم با اطمینان آن را تحویل می‌دهیم و این دو روش اصلا تناقضی با هم ندارند.
</p>


### سوال ۴
<p align="justify">
اینگونه دیگر لازم نبود یک کلاس abstract تعریف کنیم و با همان ارث بری مربع
از مستطیل
می‌توانستیم این کار را انجام د‌هیم. البته که روش درست این است که باز هم principleها را رعایت کنیم زیرا بعدا اگر بخواهیم چیزی به کد اضافه کنیم
ممکن است دوباره این طراحی مشکل‌ساز شود زیرا اصول را رعایت نکرده‌ایم و به همین دلیل منجر به انجام کارهایی می‌شویم که در تضاد با اصول شی‌گرایی است.
</p>

