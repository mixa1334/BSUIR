import time, locale

locale.setlocale(locale.LC_ALL, None)
str1 = time.strftime("%d %B %Y", time.localtime(time.time()))
print(str1)
locale.setlocale(locale.LC_ALL, "ru_RU.UTF-8")
str2 = time.strftime("%d %B %Y", time.localtime(time.time()))
print(str2)
