import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args)
    {
        Random random = ThreadLocalRandom.current();
        List<ItemGenerator> generatorList = new ArrayList<>();
        DiamondGenerator g1 = new DiamondGenerator();
        generatorList.add(new DiamondGenerator());
        generatorList.add(new GoldGenerator());
        generatorList.add(new SilverGenerator());
        generatorList.add(new PearlGenerator());
        generatorList.add(new EmeraldGenerator());
        generatorList.add(new CakeGenerator());
        generatorList.add(new MushroomGenerator());

        for(int i = 0;i<10;i++) {
            int indx = Math.abs(random.nextInt()%2)==0?0:1;
            ItemGenerator itemGenerator = generatorList.get(indx);
            itemGenerator.openReward();
        //System.out.println("Hello world!");
    }

    public abstract class ItemGenerator{
        public void openReward()
        {
            GameItem gameItem = createItem();
            gameItem.open();
        }
        public abstract GameItem createItem();
    }

    public interface GameItem{
        void open();
    }

    public class GoldReward implements GameItem
    {
        @Override
        public void open()
        {
            System.out.println("Gold");
        }
    }

    public class DiamondReward implements GameItem
    {
        @Override
        public void open()
        {
            System.out.println("Diamond");
        }
    }

   // Добавляю 5 новых классов содержащих методы, которые описывают содержание награды - Серебро, жемчук, изумруд, торт и гриб.


    public class SilverReward implements GameItem
    {
         @Override
         public void open()
         {
             System.out.println("Silver");
         }
    }

    public class PearlReward implements GameItem
    {
         @Override
         public void open()
         {
             System.out.println("Pearl");
         }
    }

    public class EmeraldReward implements GameItem
    {
         @Override
         public void open()
         {
             System.out.println("Emerald");
         }
    }

    public class CakeReward implements GameItem
    {
         @Override
         public void open()
         {
             System.out.println("Cake");
         }
    }

    public class MushroomReward implements GameItem
    {
         @Override
         public void open()
         {
             System.out.println("Mushroom");
         }
    }



    public class GoldGenerator extends ItemGenerator
    {
        @Override
        public GameItem createItem() {
            return new GoldReward();
        }
    }
    public class DiamondGenerator extends ItemGenerator
    {
        @Override
        public GameItem createItem() {
            return new DiamondReward();
        }
    }


 // Добавляю классы-наследники ItemGenerator и создаю объекты классов.

    public class SilverGenerator extends ItemGenerator
    {
        @Override
        public GameItem createItem() {
            return new SilverReward();
        }
    }

    public class PearlGenerator extends ItemGenerator
    {
        @Override
        public GameItem createItem() {
            return new PearlReward();
        }
    }

    public class EmeraldGenerator extends ItemGenerator
    {
        @Override
        public GameItem createItem() {
            return new EmeraldReward();
        }
    }

    public class CakeGenerator extends ItemGenerator
    {
        @Override
        public GameItem createItem() {
            return new CakeReward();
        }
    }

    public class MushroomGenerator extends ItemGenerator
    {
    @Override
    public GameItem createItem() {
        return new MushroomReward();
    }

    }

    }







