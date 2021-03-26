package rpm_java;

import java.util.*;

public class RPM {

        public static void main(String[] args) {
            /*Animal elephant = new Animal("слон", "млекопитающее");
            System.out.println(elephant);
            Animal spider = new Animal("паук", "членистоногое", 8, 1, true);
            System.out.println(spider);*/
                /*Teacher teacher = new Teacher("Petrov", 4, "Biology", new Group[] {new Group("1a", 25), new Group("1b", 34)});
                Teacher teacher1 = new Teacher("Sidorov", 17, "Phisics", 5);
                System.out.println(teacher.hasGroup("1a"));
                System.out.println(teacher.removeGroup("1a"));
                System.out.println(teacher1.addGroup(new Group("3g", 27)));
                System.out.println(teacher);
                System.out.println(teacher1);*/
                /*CPU cpu = new CPU("1", 4, 1.5F, 2.6F);
                GPU gpu = new GPU("2", 2, false);
                Memory[] memory = new Memory[]{new Memory(4, 2400)};
                Computer computer = new Computer(cpu, gpu, memory);
                System.out.println(computer.getRating());
                System.out.println(computer);
                Computer computer1 = computer.copy();
                cpu.setTitle("brg");
                memory[0].setMemory(2600);
                System.out.println(computer1);*/
                /*Appartment flat1 = new Appartment(198776, "Petrov", 32.4, 2);
                Appartment flat2 = new Appartment(198766, "Kovrov", 25.1,1);
                Address address = new Address("Russia", "Moscow", "Moscow", "Tverskaya", 198788 );
                Building building1 = new Building("House", address, new Appartment[]{flat1, flat2});
                System.out.println(building1);
                System.out.println(building1.getAppartmentOwner(198766));
                Building building2 = building1.copy();
                building2.setAppartmentOwner(198766, "Sidorov");
                System.out.println(building2);*/
                //System.out.println(MathUtils.calculateQuadraticEquation(new QuadraticEquation(1, -2, 1)));
                /*AddressNew addressNew = new AddressNew("Nevsky Prospect", 24, 1);
                AddressNew addressNew2 = new AddressNew("Nevsky Prospect", 25, 3);
                BuildingNew buildingNew = new BuildingNew(addressNew, BuildingTypeEnum.LIVING, 5);
                BuildingNew buildingNew1 = new BuildingNew(addressNew2, BuildingTypeEnum.SOCIAL, 4);
                City city = new City("Saint-Petersbursg", CityTypeEnum.METROPOLIS, 5000000,  new BuildingNew[] {buildingNew,buildingNew1});
                System.out.println(city);
                System.out.println(city.getBuildingByAddress(addressNew));
                System.out.println(city.hasBuildingByAddress(addressNew2));*/
            /*Zoo zoo = new Zoo("Ленинградский", new EntityLiving[]{new Bear(), new Solovey(50, 5, "Свист")
                    , new Solovey(60, 10, "Свист (неприятный)"), new Cow()});
            System.out.println(zoo.getSoundEntityCount());
            System.out.println(zoo.getFlyCount());
            System.out.println(zoo.getPredatorEntityCount());
            Bear bear = new Bear();
            Cow cow = new Cow();
            zoo.feedPredators(cow);
            zoo.feedPredators(bear);*/
            /*LinkedEntity linkedEntity = new LinkedEntity(new LinkedEntity(new LinkedEntity(null)));
            System.out.println(linkedEntity.size());
            System.out.println(linkedEntity);
            linkedEntity.add(new LinkedEntity(null));
            System.out.println(linkedEntity);
            System.out.println(linkedEntity.delete(2));
            System.out.println(linkedEntity);
            System.out.println(linkedEntity.contains(8));*/

        }
}
