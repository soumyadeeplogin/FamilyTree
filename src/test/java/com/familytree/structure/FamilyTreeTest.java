package com.familytree.structure;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FamilyTreeTest {

    private FamilyTree familyTree;
    private Node root;

    @BeforeEach
    public void setup() {
        familyTree = new FamilyTree();
        
        Person p01 = new Person("John", 200);
		Person p02 = new Person("Jinna", 198);
		Person p03 = new Person("Elvis", 180);
		Person p04 = new Person("Mariah", 179); 
		Person p05 = new Person("Michael", 165); 
		Person p06 = new Person("Fiona", 164); 
		Person p07 = new Person("George", 150); 
		Person p08 = new Person("Megan", 149); 
		Person p09 = new Person("Donald", 135); 
		Person p10 = new Person("Ahram", 132); 		
		Person p11 = new Person("Mira", 130); 
		Person p12 = new Person("Bill", 128);
		Person p13 = new Person("Jane", 127);
		Person p14 = new Person("Monica", 115);
		Person p15 = new Person("Rebacca", 113);
		Person p16 = new Person("Liam", 108);
		Person p17 = new Person("Olivia", 107);
		Person p18 = new Person("Noah", 102);
		Person p19 = new Person("Emma", 100);
		Person p20 = new Person("Oliver", 95);
		Person p21 = new Person("Ava", 94);
		Person p22 = new Person("Charlotte", 93);
		Person p23 = new Person("ELijah", 80);
		Person p24 = new Person("Lucas", 75);
		Person p25 = new Person("Mia", 74);
		Person p26 = new Person("Alexander", 60);
		Person p27 = new Person("Henry", 58);
		Person p28 = new Person("William", 55);
		Person p29 = new Person("Abbe", 40);
		Person p30 = new Person("Jude", 35);
		Person p31 = new Person("Jalen", 30);
		Person p32 = new Person("Rowan", 29);
		Person p33 = new Person("Evan", 27);
		Person p34 = new Person("Harper", 25);
		Person p35 = new Person("Sloan", 24);
		Person p36 = new Person("Leilani", 21);
		Person p37 = new Person("Arlo", 22);
		Person p38 = new Person("Luna", 19);
		Person p39 = new Person("Gigi", 18);
		Person p40 = new Person("Fin", 15);
		Person p41 = new Person("Delihah", 14);
		Person p42 = new Person("Adonis", 13);
		Person p43 = new Person("Elias", 11);
		Person p44 = new Person("Hadley", 10);
		Person p45 = new Person("Sopiah", 8);
		Person p46 = new Person("Penelop", 7);
		Person p47 = new Person("Zia", 5);
		Person p48 = new Person("Tiana", 4);
		Person p49 = new Person("Rohan", 3);
		Person p50 = new Person("Alex", 2);
		
		Node gen1 = new Node();
		gen1.setParents(p01,p02);
		gen1.setPrevious(null);
		
		
		Node gen21 = new Node();
		gen21.setParents(p03,p06);
		gen21.setPrevious(gen1);
		
		Node gen22 = new Node();
		gen22.setParents(p04,p07);
		gen22.setPrevious(gen1);
		
		Node gen23 = new Node();
		gen23.setParents(p05,p08);
		gen23.setPrevious(gen1);
		
		Node gen31 = new Node();
		gen31.setParents(p09);
		gen31.setPrevious(gen21);
		
		Node gen32 = new Node();
		gen32.setParents(p10,p14);
		gen32.setPrevious(gen21);
		
		Node gen33 = new Node();
		gen33.setParents(p11,p15);
		gen33.setPrevious(gen23);
		
		Node gen34 = new Node();
		gen34.setParents(p12);
		gen34.setPrevious(gen23);
		
		Node gen35 = new Node();
		gen35.setParents(p13,p16);
		gen35.setPrevious(gen23);
		
		Node gen41 = new Node();
		gen41.setParents(p17,p26);
		gen41.setPrevious(gen31);
		
		Node gen42 = new Node();
		gen42.setParents(p18);
		gen42.setPrevious(gen31);
		
		Node gen43 = new Node();
		gen43.setParents(p19,p38);
		gen43.setPrevious(gen31);
		
		Node gen44 = new Node();
		gen44.setParents(p20);
		gen44.setPrevious(gen31);
		
		Node gen45 = new Node();
		gen45.setParents(p21);
		gen45.setPrevious(gen32);
		
		Node gen46 = new Node();
		gen46.setParents(p22);
		gen46.setPrevious(gen33);
		
		Node gen47 = new Node();
		gen47.setParents(p23,p32);
		gen47.setPrevious(gen35);
		
		Node gen48 = new Node();
		gen48.setParents(p24);
		gen48.setPrevious(gen35);
		
		Node gen49 = new Node();
		gen49.setParents(p25);
		gen49.setPrevious(gen35);
		
		Node gen51 = new Node();
		gen51.setParents(p27,p28);
		gen51.setPrevious(gen41);
		
		Node gen52 = new Node();
		gen52.setParents(p29,p35);
		gen52.setPrevious(gen41);
		
		Node gen53 = new Node();
		gen53.setParents(p30);
		gen53.setPrevious(gen41);
		
		Node gen54 = new Node();
		gen54.setParents(p31);
		gen54.setPrevious(gen41);
		
		Node gen55 = new Node();
		gen55.setParents(p33);
		gen55.setPrevious(gen47);
		
		Node gen56 = new Node();
		gen56.setParents(p19,p38);
		gen56.setPrevious(gen43);
		
		Node gen57 = new Node();
		gen57.setParents(p34,p42);
		gen57.setPrevious(gen47);
		
		Node gen61 = new Node();
		gen61.setParents(p36);
		gen61.setPrevious(gen52);
		
		Node gen62 = new Node();
		gen62.setParents(p37);
		gen62.setPrevious(gen52);
		
		Node gen63 = new Node();
		gen63.setParents(p43);
		gen63.setPrevious(gen57);
		
		Node gen64 = new Node();
		gen64.setParents(p44);
		gen64.setPrevious(gen57);
		
		Node gen65 = new Node();
		gen65.setParents(p45);
		gen65.setPrevious(gen57);
		
		Node gen66 = new Node();
		gen66.setParents(p46);
		gen66.setPrevious(gen57);
		
		Node gen67 = new Node();
		gen67.setParents(p39);
		gen67.setPrevious(gen56);
		
		Node gen68 = new Node();
		gen68.setParents(p40);
		gen68.setPrevious(gen56);
		
		Node gen69 = new Node();
		gen69.setParents(p41);
		gen69.setPrevious(gen56);
		
		Node gen71 = new Node();
		gen71.setParents(p47);
		gen71.setPrevious(gen65);
		
		Node gen72 = new Node();
		gen72.setParents(p48);
		gen72.setPrevious(gen65);
		
		Node gen73 = new Node();
		gen73.setParents(p49);
		gen73.setPrevious(gen65);
		
		Node gen74 = new Node();
		gen74.setParents(p50);
		gen74.setPrevious(gen65);
		
		root = gen1;
		
    }

    @Test
    void WHEN_displaying_the_complete_family_tree() {
        assertEquals(expectedFamilyTree, familyTree.display(root));
    }

    @Test
    void WHEN_familytree_is_sorted_by_age_in_decending_order() {
    	assertEquals(expectedSortedByAge, familyTree.sortByAge(root));
    }

    @Test
    void WHEN_inserting_a_new_member() {
    	Person person = new Person("Person Test", 30);
    	familyTree.insert(root, person);
    	assertEquals(expectedTreeAfterInsert, familyTree.display(root));
    }
    
    String expectedFamilyTree = "Gen 1\n" + 
    		"John -- Jinna	\n" + 
    		"\n" + 
    		"Gen 2\n" + 
    		"Elvis -- Fiona	\n" + 
    		"Mariah -- George	\n" + 
    		"Michael -- Megan	\n" + 
    		"\n" + 
    		"Gen 3\n" + 
    		"Donald	\n" + 
    		"Ahram -- Monica	\n" + 
    		"Mira -- Rebacca	\n" + 
    		"Bill	\n" + 
    		"Jane -- Liam	\n" + 
    		"\n" + 
    		"Gen 4\n" + 
    		"Olivia -- Alexander	\n" + 
    		"Noah	\n" + 
    		"Emma -- Luna	\n" + 
    		"Oliver	\n" + 
    		"Ava	\n" + 
    		"Charlotte	\n" + 
    		"ELijah -- Rowan	\n" + 
    		"Lucas	\n" + 
    		"Mia	\n" + 
    		"\n" + 
    		"Gen 5\n" + 
    		"Henry -- William	\n" + 
    		"Abbe -- Sloan	\n" + 
    		"Jude	\n" + 
    		"Jalen	\n" + 
    		"Emma -- Luna	\n" + 
    		"Evan	\n" + 
    		"Harper -- Adonis	\n" + 
    		"\n" + 
    		"Gen 6\n" + 
    		"Leilani	\n" + 
    		"Arlo	\n" + 
    		"Gigi	\n" + 
    		"Fin	\n" + 
    		"Delihah	\n" + 
    		"Elias	\n" + 
    		"Hadley	\n" + 
    		"Sopiah	\n" + 
    		"Penelop	\n" + 
    		"\n" + 
    		"Gen 7\n" + 
    		"Zia	\n" + 
    		"Tiana	\n" + 
    		"Rohan	\n" + 
    		"Alex	\n" + 
    		"\n" +
    		"";
    String expectedSortedByAge="John -> 200\n" + 
    		"Jinna -> 198\n" + 
    		"Elvis -> 180\n" + 
    		"Mariah -> 179\n" + 
    		"Michael -> 165\n" + 
    		"Fiona -> 164\n" + 
    		"George -> 150\n" + 
    		"Megan -> 149\n" + 
    		"Donald -> 135\n" + 
    		"Ahram -> 132\n" + 
    		"Mira -> 130\n" + 
    		"Bill -> 128\n" + 
    		"Jane -> 127\n" + 
    		"Monica -> 115\n" + 
    		"Rebacca -> 113\n" + 
    		"Liam -> 108\n" + 
    		"Olivia -> 107\n" + 
    		"Noah -> 102\n" + 
    		"Emma -> 100\n" + 
    		"Emma -> 100\n" + 
    		"Oliver -> 95\n" + 
    		"Ava -> 94\n" + 
    		"Charlotte -> 93\n" + 
    		"ELijah -> 80\n" + 
    		"Lucas -> 75\n" + 
    		"Mia -> 74\n" + 
    		"Alexander -> 60\n" + 
    		"Henry -> 58\n" + 
    		"William -> 55\n" + 
    		"Abbe -> 40\n" + 
    		"Jude -> 35\n" + 
    		"Jalen -> 30\n" + 
    		"Rowan -> 29\n" + 
    		"Evan -> 27\n" + 
    		"Harper -> 25\n" + 
    		"Sloan -> 24\n" + 
    		"Arlo -> 22\n" + 
    		"Leilani -> 21\n" + 
    		"Luna -> 19\n" + 
    		"Luna -> 19\n" + 
    		"Gigi -> 18\n" + 
    		"Fin -> 15\n" + 
    		"Delihah -> 14\n" + 
    		"Adonis -> 13\n" + 
    		"Elias -> 11\n" + 
    		"Hadley -> 10\n" + 
    		"Sopiah -> 8\n" + 
    		"Penelop -> 7\n" + 
    		"Zia -> 5\n" + 
    		"Tiana -> 4\n" + 
    		"Rohan -> 3\n" + 
    		"Alex -> 2\n";
    
    String expectedTreeAfterInsert = "Gen 1\n" + 
    		"John -- Jinna	\n" + 
    		"\n" + 
    		"Gen 2\n" + 
    		"Elvis -- Fiona	\n" + 
    		"Mariah -- George	\n" + 
    		"Michael -- Megan	\n" + 
    		"\n" + 
    		"Gen 3\n" + 
    		"Donald	\n" + 
    		"Ahram -- Monica	\n" + 
    		"Mira -- Rebacca	\n" + 
    		"Bill	\n" + 
    		"Jane -- Liam	\n" + 
    		"\n" + 
    		"Gen 4\n" + 
    		"Olivia -- Alexander	\n" + 
    		"Noah	\n" + 
    		"Emma -- Luna	\n" + 
    		"Oliver	\n" + 
    		"Ava	\n" + 
    		"Charlotte	\n" + 
    		"ELijah -- Rowan	\n" + 
    		"Lucas	\n" + 
    		"Mia	\n" + 
    		"\n" + 
    		"Gen 5\n" + 
    		"Henry -- William	\n" + 
    		"Abbe -- Sloan	\n" + 
    		"Jude	\n" + 
    		"Jalen	\n" + 
    		"Emma -- Luna	\n" + 
    		"Evan	\n" + 
    		"Harper -- Adonis	\n" + 
    		"\n" + 
    		"Gen 6\n" + 
    		"Leilani	\n" + 
    		"Arlo	\n" + 
    		"Person Test	\n" + 
    		"Gigi	\n" + 
    		"Fin	\n" + 
    		"Delihah	\n" + 
    		"Elias	\n" + 
    		"Hadley	\n" + 
    		"Sopiah	\n" + 
    		"Penelop	\n" + 
    		"\n" + 
    		"Gen 7\n" + 
    		"Zia	\n" + 
    		"Tiana	\n" + 
    		"Rohan	\n" + 
    		"Alex	\n" + 
    		"\n" + 
    		"";
}