 Занятие 2 : Принципы ООП Абстракция и Интерфейсы.
Примеры проектирования.

1) Где используется и какие ограничения накладывает ключевое слово static ?
2) Где и для чего используется ключевое слово final ?

Что нужно помнить об абстрактных классах: 
● нельзя создать объект абстрактного класса; 
● в абстрактном классе могут быть конкретные реализации методов;
● если в классе объявлен хоть один абстрактный метод, сам класс должен быть объявлен 
абстрактным.

3) Переделать общие методы класса Animal - в абстрактные, используя код с предыдущего урока
   (посмотреть поведение программы и исправить недочеты)

4) Создать метод свернуться в клубок у кота.

5) Попрактикуемся на задаче: 
	Создать классы Собака, Кот,Домашний Кот, Тигр, Животное  
	Животные могут бежать и плыть. В качестве аргумента каждому методу передается длина препятствия.
	У каждого животного есть ограничения на действия (бег: кот — 200 м, собака — 500 м; плавание: 
    кот — не умеет плавать, собака — 10 м). Результатом выполнения действия будет печать в консоль.
	 Например: dogBobik.run(150); -> 'Бобик пробежал 150 м'. 
	Создать один массив с животными и заставить их по очереди пробежать дистанцию и проплыть. 
	 Добавить подсчет созданных Домашних Котов, Тигров, Собак, Животных.

6) Создать класс человек с возможностью ездить и останавливаться на: машине, скейтборде,велосипеде
   (что будет если расширить список ?).
