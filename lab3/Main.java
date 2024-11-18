
public class Main {
    public static void main(String[] args) {
        Person author = new Person("Автор");
        Item book1 = new Item("библия", ItemTypes.BOOKS, 3);
        Item book2 = new Item("молитвенник", ItemTypes.BOOKS, 3);
        Item book3 = new Item("книга на португальском", ItemTypes.BOOKS, 2);
        author.appends(book1, book2, book3);

        Ship steamboat = new Ship("Пароход");

        Room captain_room = new Room("Комната капитана");
        Item ink = new Item("чернила", ItemTypes.WRITING_MATERIALS, 10);
        Item paper = new Item("бумага", ItemTypes.WRITING_MATERIALS, 34);
        Item feather = new Item("перья", ItemTypes.WRITING_MATERIALS, 12);
        Item compass = new Item("компас", ItemTypes.GEOGRAPHIC_TOOLS, 4);
        Item spyglass = new Item("подзорная труба", ItemTypes.GEOGRAPHIC_TOOLS, 3);
        Item telescope = new Item("телескоп", ItemTypes.ASTRONOMIC_TOOLS, 1);
        captain_room.appends(ink, paper, feather, compass, spyglass, telescope);

        Room my_room = new Room("Комната автора");

//Создадим животных
        Cat cat1 = new Cat("Муся");
        Cat cat2 = new Cat("Маруся");
        Dog dog1 = new Dog("Пёс");

        System.out.println("\nЧАСТЬ 1\n");
//Добавляем комнаты на корабль и существ
        steamboat.addRoom(captain_room, my_room);
        steamboat.addEntity(author, cat1, cat2, dog1);

//Автор показывает багаж
        author.think("У меня есть");
        author.inventory.show();

//Автор берет вещи с корабля
        Room captainRoom = steamboat.enterRoom("Комната капитана");

        while (!captainRoom.chest.isEmpty()){
            Item item = captainRoom.randomPop();
            author.append(item.name, item);
        }

//Автор забрасывает вещи к себе в каютy
        Room myRoom = steamboat.enterRoom("Комната автора");

        while (!author.inventory.isEmpty()){
            Item item = author.randomPop();
            myRoom.append(item.name, item);
        }

//Автор говорит о том, что на корабле не только он один:
        steamboat.showEntities();
        System.out.println("\nЧАСТЬ 2\n");

//Автор вспоминаем историю:
        author.think("Я помню историю");

        Raft raft = new Raft("Плот");
        raft.addEntity(author, cat1, cat2);
        raft.sail();

        System.out.println("\nЧАСТЬ 3\n");

//Про собаку
        Ship theFirstAdventureShip = new Ship("Первое путешествие");
        theFirstAdventureShip.addEntity(author);
        theFirstAdventureShip.sail();
        dog1.swim();

        dog1.trust(author);
        author.tame(dog1);

        author.wish("Хочу, чтобы собака заговорила", 0.0);
        author.voice();
        dog1.voice();

        System.out.println("\nЧАСТЬ 4\n");

//Автор взял перья, чернилы, бумагу
        captainRoom = steamboat.enterRoom("Комната автора");
        ink = captainRoom.pop("чернила");
        feather = captainRoom.pop("перья");
        paper = captainRoom.pop("бумага");
        author.appends(ink, feather, paper);

//Автор пишет истории, но чернила заканчиваются
//Здесь будет проверяемое исключение, есть ли чернила у автора
        short days = 4;
        do {
            ink = author.pop("чернила");
            paper = author.pop("бумага");
            feather = author.pop("перья");
            author.writeable = author.interact("готовиться писать", paper);
            author.writeable = author.interact("готовиться писать", ink);
            author.writeable = author.interact("пишет", feather);
            author.append("чернила", ink);
            author.append("бумага", paper);
            author.append("перья", feather);
            days--;
        } while ( days > 0 );

        System.out.println("\nЧАСТЬ 5\n");

        //Огромный склад
        author.think("Много у меня вещей");
        author.inventory.show();

//Пытаемся использовать лопату, заступ, кирку, но их нет
//Здесь будут вызваны ошибки, так как у автора нет лопаты, заступа и т.д
        Item shovel = author.pop("лопата");
        author.interact("копать", shovel);
        Item spade = author.pop("заступ");
        author.interact("копать", spade);
        Item pickaxe = author.pop("кирка");
        author.interact("копать", pickaxe);

//Нет иголок, ниток, белья
        Item threads = author.pop("нитки");
        author.interact("штопать", threads);
        Item needles = author.pop("иголки");
        author.interact("штопать", needles);
        Item clothers = author.pop("одежда");
        author.interact("носить", clothers);

//Мысли автора:
        author.think("Я научился обходиться и без одежды");
    }
}