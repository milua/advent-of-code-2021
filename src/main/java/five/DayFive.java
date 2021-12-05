package main.java.five;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DayFive {
    private String input = "498,436 -> 498,932\n" +
            "173,176 -> 845,848\n" +
            "927,799 -> 927,418\n" +
            "576,67 -> 801,67\n" +
            "908,147 -> 743,147\n" +
            "300,478 -> 300,224\n" +
            "286,979 -> 286,310\n" +
            "230,435 -> 729,934\n" +
            "260,602 -> 260,56\n" +
            "82,686 -> 655,113\n" +
            "460,918 -> 460,224\n" +
            "191,820 -> 454,820\n" +
            "964,483 -> 964,772\n" +
            "395,705 -> 142,705\n" +
            "281,563 -> 134,563\n" +
            "155,509 -> 152,509\n" +
            "754,586 -> 742,586\n" +
            "620,114 -> 620,775\n" +
            "450,476 -> 450,212\n" +
            "135,845 -> 591,845\n" +
            "922,902 -> 110,90\n" +
            "562,71 -> 895,71\n" +
            "843,13 -> 843,620\n" +
            "413,398 -> 486,471\n" +
            "206,601 -> 409,398\n" +
            "854,813 -> 65,813\n" +
            "625,17 -> 293,349\n" +
            "778,807 -> 778,145\n" +
            "372,655 -> 566,655\n" +
            "520,490 -> 520,289\n" +
            "450,787 -> 450,717\n" +
            "416,649 -> 826,649\n" +
            "479,601 -> 313,601\n" +
            "817,560 -> 817,862\n" +
            "135,272 -> 287,272\n" +
            "705,250 -> 796,159\n" +
            "457,656 -> 445,656\n" +
            "667,829 -> 659,829\n" +
            "804,450 -> 804,410\n" +
            "565,322 -> 565,113\n" +
            "645,614 -> 972,614\n" +
            "94,634 -> 421,634\n" +
            "739,903 -> 122,903\n" +
            "730,549 -> 963,782\n" +
            "798,563 -> 969,563\n" +
            "784,245 -> 176,245\n" +
            "439,872 -> 448,872\n" +
            "107,586 -> 906,586\n" +
            "33,162 -> 573,702\n" +
            "48,426 -> 362,112\n" +
            "927,662 -> 927,939\n" +
            "723,363 -> 723,389\n" +
            "321,237 -> 982,237\n" +
            "554,541 -> 554,726\n" +
            "779,292 -> 779,61\n" +
            "864,491 -> 864,970\n" +
            "497,482 -> 497,801\n" +
            "919,767 -> 919,965\n" +
            "57,611 -> 57,221\n" +
            "200,481 -> 200,229\n" +
            "164,292 -> 164,608\n" +
            "103,664 -> 694,73\n" +
            "950,162 -> 181,931\n" +
            "977,336 -> 293,336\n" +
            "946,912 -> 80,912\n" +
            "805,142 -> 89,858\n" +
            "976,85 -> 245,85\n" +
            "987,961 -> 987,530\n" +
            "783,683 -> 443,683\n" +
            "276,746 -> 490,532\n" +
            "424,352 -> 424,725\n" +
            "103,31 -> 559,31\n" +
            "697,284 -> 697,305\n" +
            "292,789 -> 627,454\n" +
            "61,83 -> 151,83\n" +
            "686,199 -> 652,233\n" +
            "780,883 -> 780,512\n" +
            "901,609 -> 346,54\n" +
            "136,939 -> 136,612\n" +
            "678,594 -> 408,594\n" +
            "987,693 -> 987,178\n" +
            "783,517 -> 828,517\n" +
            "718,846 -> 23,151\n" +
            "416,286 -> 518,286\n" +
            "480,612 -> 130,612\n" +
            "801,805 -> 801,259\n" +
            "676,749 -> 119,192\n" +
            "330,954 -> 936,348\n" +
            "258,407 -> 258,791\n" +
            "497,804 -> 668,804\n" +
            "330,723 -> 497,556\n" +
            "691,253 -> 691,408\n" +
            "141,68 -> 365,68\n" +
            "643,497 -> 305,159\n" +
            "498,938 -> 765,671\n" +
            "982,825 -> 580,825\n" +
            "863,300 -> 959,396\n" +
            "291,64 -> 291,745\n" +
            "601,609 -> 601,182\n" +
            "564,428 -> 564,66\n" +
            "792,365 -> 792,161\n" +
            "718,123 -> 718,813\n" +
            "545,493 -> 903,851\n" +
            "176,13 -> 988,825\n" +
            "514,205 -> 514,415\n" +
            "86,825 -> 446,825\n" +
            "684,867 -> 684,951\n" +
            "265,917 -> 936,246\n" +
            "310,655 -> 310,920\n" +
            "794,370 -> 809,370\n" +
            "170,475 -> 75,570\n" +
            "128,644 -> 200,572\n" +
            "293,105 -> 600,105\n" +
            "846,984 -> 976,984\n" +
            "531,311 -> 977,311\n" +
            "749,565 -> 315,565\n" +
            "892,311 -> 452,751\n" +
            "29,980 -> 974,35\n" +
            "433,355 -> 433,307\n" +
            "718,528 -> 261,985\n" +
            "649,488 -> 156,488\n" +
            "571,265 -> 119,717\n" +
            "801,31 -> 66,766\n" +
            "984,521 -> 213,521\n" +
            "553,973 -> 20,973\n" +
            "981,984 -> 15,18\n" +
            "174,117 -> 174,880\n" +
            "308,161 -> 308,443\n" +
            "342,633 -> 342,507\n" +
            "871,822 -> 258,822\n" +
            "899,835 -> 83,19\n" +
            "557,242 -> 557,211\n" +
            "163,57 -> 895,789\n" +
            "252,84 -> 342,174\n" +
            "863,512 -> 863,66\n" +
            "351,458 -> 351,304\n" +
            "548,427 -> 266,145\n" +
            "794,624 -> 794,303\n" +
            "408,889 -> 408,457\n" +
            "10,782 -> 10,216\n" +
            "837,230 -> 837,213\n" +
            "973,809 -> 109,809\n" +
            "913,53 -> 41,925\n" +
            "637,324 -> 921,40\n" +
            "806,603 -> 806,800\n" +
            "814,181 -> 41,954\n" +
            "320,790 -> 574,790\n" +
            "281,683 -> 646,683\n" +
            "145,344 -> 246,344\n" +
            "806,128 -> 806,164\n" +
            "677,855 -> 650,882\n" +
            "177,841 -> 177,25\n" +
            "775,254 -> 41,254\n" +
            "337,685 -> 563,459\n" +
            "69,271 -> 69,463\n" +
            "748,390 -> 504,634\n" +
            "370,203 -> 370,338\n" +
            "401,914 -> 436,879\n" +
            "562,139 -> 266,435\n" +
            "253,99 -> 232,99\n" +
            "238,270 -> 142,270\n" +
            "532,555 -> 433,555\n" +
            "219,23 -> 919,723\n" +
            "988,783 -> 988,795\n" +
            "60,663 -> 12,663\n" +
            "392,961 -> 962,961\n" +
            "116,805 -> 23,712\n" +
            "739,824 -> 68,824\n" +
            "968,461 -> 245,461\n" +
            "511,926 -> 918,519\n" +
            "76,729 -> 367,438\n" +
            "335,138 -> 335,849\n" +
            "888,53 -> 86,855\n" +
            "660,111 -> 660,534\n" +
            "938,981 -> 63,106\n" +
            "190,487 -> 145,487\n" +
            "13,738 -> 13,18\n" +
            "964,959 -> 16,11\n" +
            "940,508 -> 456,508\n" +
            "311,516 -> 311,391\n" +
            "249,430 -> 597,778\n" +
            "944,60 -> 944,337\n" +
            "696,228 -> 490,228\n" +
            "189,458 -> 341,610\n" +
            "414,970 -> 570,970\n" +
            "51,912 -> 960,912\n" +
            "736,923 -> 96,923\n" +
            "884,482 -> 552,150\n" +
            "819,41 -> 168,41\n" +
            "762,806 -> 169,806\n" +
            "285,59 -> 890,59\n" +
            "891,751 -> 469,751\n" +
            "147,466 -> 147,868\n" +
            "151,626 -> 151,45\n" +
            "986,986 -> 10,10\n" +
            "539,681 -> 539,979\n" +
            "530,273 -> 530,181\n" +
            "613,140 -> 599,154\n" +
            "426,473 -> 426,467\n" +
            "338,795 -> 857,795\n" +
            "548,711 -> 715,711\n" +
            "479,30 -> 479,177\n" +
            "16,871 -> 75,812\n" +
            "410,621 -> 552,621\n" +
            "730,814 -> 58,814\n" +
            "990,728 -> 209,728\n" +
            "164,783 -> 164,820\n" +
            "523,689 -> 189,355\n" +
            "86,531 -> 875,531\n" +
            "470,585 -> 152,267\n" +
            "704,484 -> 551,484\n" +
            "829,197 -> 776,197\n" +
            "39,10 -> 979,950\n" +
            "653,144 -> 844,144\n" +
            "80,462 -> 104,486\n" +
            "249,703 -> 160,703\n" +
            "817,725 -> 817,15\n" +
            "972,895 -> 173,96\n" +
            "610,28 -> 610,664\n" +
            "452,581 -> 452,848\n" +
            "243,623 -> 144,623\n" +
            "837,175 -> 757,95\n" +
            "592,843 -> 592,210\n" +
            "233,505 -> 848,505\n" +
            "591,710 -> 820,481\n" +
            "945,46 -> 247,744\n" +
            "357,883 -> 961,279\n" +
            "615,900 -> 185,900\n" +
            "93,673 -> 976,673\n" +
            "629,692 -> 298,361\n" +
            "888,111 -> 888,652\n" +
            "873,876 -> 366,369\n" +
            "14,373 -> 14,370\n" +
            "690,786 -> 73,169\n" +
            "305,888 -> 305,811\n" +
            "429,490 -> 429,442\n" +
            "177,92 -> 177,836\n" +
            "892,733 -> 754,733\n" +
            "442,211 -> 442,896\n" +
            "686,21 -> 686,809\n" +
            "413,689 -> 275,689\n" +
            "522,601 -> 522,525\n" +
            "41,952 -> 925,68\n" +
            "635,97 -> 538,194\n" +
            "849,826 -> 351,826\n" +
            "915,254 -> 877,292\n" +
            "118,64 -> 928,64\n" +
            "36,21 -> 985,970\n" +
            "334,374 -> 589,374\n" +
            "152,742 -> 286,742\n" +
            "714,441 -> 459,696\n" +
            "871,370 -> 871,191\n" +
            "410,527 -> 410,62\n" +
            "713,114 -> 804,205\n" +
            "577,271 -> 577,369\n" +
            "144,72 -> 939,867\n" +
            "424,139 -> 424,491\n" +
            "458,585 -> 228,815\n" +
            "550,151 -> 932,533\n" +
            "179,200 -> 179,981\n" +
            "423,524 -> 701,246\n" +
            "755,552 -> 755,689\n" +
            "728,250 -> 840,362\n" +
            "892,583 -> 892,785\n" +
            "328,241 -> 506,241\n" +
            "837,441 -> 837,414\n" +
            "101,44 -> 942,885\n" +
            "917,833 -> 451,833\n" +
            "52,216 -> 35,199\n" +
            "964,375 -> 451,888\n" +
            "572,509 -> 572,680\n" +
            "602,558 -> 602,396\n" +
            "555,652 -> 763,652\n" +
            "198,617 -> 523,617\n" +
            "585,964 -> 585,721\n" +
            "376,534 -> 556,534\n" +
            "360,466 -> 360,757\n" +
            "875,571 -> 875,68\n" +
            "964,757 -> 595,757\n" +
            "787,785 -> 804,785\n" +
            "670,863 -> 343,863\n" +
            "449,453 -> 449,681\n" +
            "16,313 -> 657,954\n" +
            "958,68 -> 706,320\n" +
            "726,635 -> 726,715\n" +
            "790,865 -> 790,459\n" +
            "926,946 -> 13,33\n" +
            "61,761 -> 247,761\n" +
            "386,939 -> 386,426\n" +
            "909,192 -> 909,216\n" +
            "387,161 -> 28,520\n" +
            "182,740 -> 182,178\n" +
            "443,975 -> 715,703\n" +
            "194,714 -> 870,38\n" +
            "636,522 -> 636,308\n" +
            "153,220 -> 248,315\n" +
            "532,427 -> 72,887\n" +
            "673,521 -> 464,521\n" +
            "191,362 -> 749,920\n" +
            "718,747 -> 306,335\n" +
            "85,733 -> 561,733\n" +
            "710,714 -> 243,714\n" +
            "191,132 -> 704,645\n" +
            "983,60 -> 76,60\n" +
            "740,708 -> 460,988\n" +
            "105,987 -> 908,184\n" +
            "629,943 -> 629,136\n" +
            "386,515 -> 236,365\n" +
            "988,10 -> 12,986\n" +
            "989,479 -> 989,855\n" +
            "232,860 -> 232,612\n" +
            "719,526 -> 406,213\n" +
            "548,242 -> 175,242\n" +
            "172,21 -> 172,295\n" +
            "158,935 -> 158,267\n" +
            "743,331 -> 109,965\n" +
            "177,465 -> 177,883\n" +
            "694,46 -> 694,714\n" +
            "589,328 -> 915,328\n" +
            "721,865 -> 170,314\n" +
            "56,373 -> 934,373\n" +
            "558,635 -> 558,199\n" +
            "187,116 -> 323,252\n" +
            "743,875 -> 827,791\n" +
            "313,219 -> 718,624\n" +
            "418,175 -> 830,175\n" +
            "620,244 -> 557,244\n" +
            "33,199 -> 33,768\n" +
            "595,562 -> 595,75\n" +
            "725,294 -> 725,97\n" +
            "645,554 -> 552,554\n" +
            "909,828 -> 849,828\n" +
            "820,25 -> 110,25\n" +
            "591,803 -> 961,803\n" +
            "101,109 -> 760,109\n" +
            "473,593 -> 473,609\n" +
            "990,714 -> 822,714\n" +
            "263,183 -> 263,301\n" +
            "919,409 -> 414,914\n" +
            "554,36 -> 554,165\n" +
            "223,168 -> 989,934\n" +
            "764,30 -> 725,30\n" +
            "518,730 -> 185,397\n" +
            "482,548 -> 482,472\n" +
            "933,34 -> 484,34\n" +
            "210,494 -> 210,769\n" +
            "354,659 -> 278,659\n" +
            "79,172 -> 603,696\n" +
            "703,120 -> 300,523\n" +
            "466,228 -> 315,77\n" +
            "977,43 -> 515,505\n" +
            "474,95 -> 163,95\n" +
            "213,275 -> 213,39\n" +
            "166,12 -> 332,12\n" +
            "931,606 -> 122,606\n" +
            "117,424 -> 616,424\n" +
            "493,980 -> 21,508\n" +
            "172,492 -> 766,492\n" +
            "630,59 -> 301,59\n" +
            "377,10 -> 970,603\n" +
            "119,287 -> 119,332\n" +
            "635,829 -> 635,313\n" +
            "626,132 -> 550,208\n" +
            "520,570 -> 27,77\n" +
            "817,974 -> 347,974\n" +
            "943,99 -> 943,734\n" +
            "470,895 -> 686,679\n" +
            "92,303 -> 286,497\n" +
            "869,714 -> 869,879\n" +
            "63,234 -> 777,948\n" +
            "426,461 -> 622,461\n" +
            "832,275 -> 832,410\n" +
            "898,937 -> 248,287\n" +
            "797,891 -> 70,164\n" +
            "642,974 -> 642,143\n" +
            "954,654 -> 868,654\n" +
            "603,34 -> 871,302\n" +
            "42,849 -> 65,849\n" +
            "683,377 -> 534,526\n" +
            "390,227 -> 490,227\n" +
            "422,980 -> 422,223\n" +
            "761,640 -> 612,640\n" +
            "238,170 -> 959,891\n" +
            "663,674 -> 904,433\n" +
            "675,833 -> 165,833\n" +
            "535,128 -> 535,14\n" +
            "509,444 -> 509,519\n" +
            "137,668 -> 442,668\n" +
            "74,427 -> 74,685\n" +
            "291,827 -> 291,486\n" +
            "557,302 -> 196,302\n" +
            "960,164 -> 210,914\n" +
            "599,418 -> 392,418\n" +
            "655,339 -> 13,981\n" +
            "202,243 -> 847,888\n" +
            "13,329 -> 359,675\n" +
            "814,191 -> 814,802\n" +
            "555,942 -> 555,377\n" +
            "879,359 -> 879,935\n" +
            "622,841 -> 622,821\n" +
            "639,592 -> 823,592\n" +
            "699,187 -> 46,840\n" +
            "967,927 -> 286,927\n" +
            "484,185 -> 484,441\n" +
            "103,442 -> 232,442\n" +
            "176,19 -> 459,302\n" +
            "696,871 -> 109,871\n" +
            "424,475 -> 424,722\n" +
            "90,28 -> 837,28\n" +
            "177,114 -> 737,674\n" +
            "626,753 -> 736,753\n" +
            "133,616 -> 133,180\n" +
            "934,62 -> 934,442\n" +
            "100,883 -> 100,497\n" +
            "549,483 -> 729,483\n" +
            "976,39 -> 36,979\n" +
            "386,140 -> 114,412\n" +
            "363,459 -> 219,459\n" +
            "563,77 -> 563,598\n" +
            "142,60 -> 827,745\n" +
            "460,519 -> 610,519\n" +
            "56,249 -> 325,249\n" +
            "924,492 -> 768,336\n" +
            "165,726 -> 475,416\n" +
            "57,418 -> 580,418\n" +
            "756,554 -> 163,554\n" +
            "82,237 -> 846,237\n" +
            "123,99 -> 383,99\n" +
            "816,527 -> 816,65\n" +
            "224,171 -> 866,813\n" +
            "833,92 -> 362,92\n" +
            "671,808 -> 671,984\n" +
            "522,25 -> 522,43\n" +
            "248,424 -> 16,192\n" +
            "297,225 -> 805,225\n" +
            "454,534 -> 79,534\n" +
            "380,936 -> 184,936\n" +
            "286,866 -> 286,97\n" +
            "543,807 -> 224,807\n" +
            "518,700 -> 600,782\n" +
            "961,809 -> 566,414\n" +
            "140,298 -> 140,695\n" +
            "328,51 -> 328,534\n" +
            "927,942 -> 28,43\n" +
            "166,654 -> 745,75\n" +
            "25,976 -> 988,13\n" +
            "563,99 -> 721,99\n" +
            "605,808 -> 605,648\n" +
            "483,603 -> 836,956\n" +
            "39,127 -> 39,815\n" +
            "942,157 -> 409,690\n" +
            "358,593 -> 733,218\n" +
            "655,297 -> 892,297\n" +
            "477,276 -> 919,276\n" +
            "355,583 -> 825,113\n" +
            "186,329 -> 522,665\n" +
            "497,838 -> 725,838\n" +
            "868,54 -> 200,54\n" +
            "270,14 -> 270,307\n" +
            "47,33 -> 47,218\n" +
            "238,190 -> 280,232\n" +
            "857,700 -> 56,700\n" +
            "593,164 -> 38,719\n" +
            "765,237 -> 25,977\n" +
            "517,48 -> 517,570\n" +
            "584,587 -> 311,587\n" +
            "781,268 -> 641,128\n" +
            "564,656 -> 564,154\n" +
            "31,530 -> 31,496\n" +
            "50,36 -> 954,940\n" +
            "17,989 -> 987,19\n" +
            "280,88 -> 762,88\n" +
            "104,698 -> 261,541\n" +
            "68,303 -> 388,303\n" +
            "959,966 -> 356,966\n" +
            "794,91 -> 35,850\n" +
            "783,197 -> 608,197\n" +
            "413,506 -> 218,311\n" +
            "642,10 -> 118,534\n" +
            "812,963 -> 657,963\n" +
            "877,828 -> 850,828\n" +
            "214,546 -> 214,116\n" +
            "559,685 -> 700,826\n" +
            "494,66 -> 774,66\n" +
            "886,730 -> 886,660\n" +
            "811,67 -> 820,67\n" +
            "375,510 -> 678,510\n" +
            "711,868 -> 490,647\n" +
            "420,945 -> 420,222\n" +
            "453,948 -> 279,948\n" +
            "956,749 -> 956,311\n" +
            "55,846 -> 55,260\n" +
            "402,94 -> 799,94\n" +
            "683,206 -> 683,324\n" +
            "710,269 -> 187,269\n" +
            "120,114 -> 120,784\n" +
            "401,616 -> 401,989\n" +
            "641,650 -> 850,650\n" +
            "424,208 -> 351,135\n" +
            "31,985 -> 988,28";

    private List<Line> allLines = new ArrayList<>();

    public DayFive() {
        System.out.println("========================");
        System.out.println("Day 5 running...");
        System.out.println("========================");

        transformIntoLines();
    }

    public void run() {

        calculateOverlappingHorizontalAndVerticalLines();
        System.out.println("-----------------------");
        // TODO PART 2
    }

    private void calculateOverlappingHorizontalAndVerticalLines() {
        System.out.println("Part One");
        System.out.println("Filter horizontal and vertical lines only...");

        List<Line> filteredHorizontalAndVerticalLines = allLines.stream()
                .filter(line -> line.isHorizontalLine() || line.isVerticalLine())
                .collect(Collectors.toList());

        System.out.printf("Filtered list consist of %d lines\n", filteredHorizontalAndVerticalLines.size());

        Point maxXAndMaxY = findMaxXAndMaxY(filteredHorizontalAndVerticalLines);
        Board board = new Board(maxXAndMaxY);
        System.out.printf("Initialized board with size: (%d,%d)\n", maxXAndMaxY.getX(), maxXAndMaxY.getY());

    }

    private Point findMaxXAndMaxY(List<Line> lines) {
        int maxX = 0;
        int maxY = 0;
        for (Line l : lines) {
            // get maxX
            if (l.getStart().getX() > l.getEnd().getX()) {
                if (l.getStart().getX() > maxX) {
                    maxX = l.getStart().getX();
                }
            } else if (l.getEnd().getX() > maxX) {
                maxX = l.getEnd().getX();
            } else if (l.getStart().getX() == l.getEnd().getX() && l.getStart().getX() > maxX) {
                maxX = l.getStart().getX();
            }
            // get maxY
            if (l.getStart().getY() > l.getEnd().getY()) {
                if (l.getStart().getY() > maxY) {
                    maxY = l.getStart().getY();
                }
            } else if (l.getEnd().getY() > maxY) {
                maxY = l.getEnd().getY();
            } else if (l.getStart().getY() == l.getEnd().getY() && l.getStart().getY() > maxY) {
                maxY = l.getStart().getY();
            }
        }
        return new Point(maxX, maxY);
    }

    private void transformIntoLines() {
        System.out.println("Transform string input...");

        String[] splitted = input.split("\n");

        for (String lineString : splitted) {
            List<Point> points = Arrays.stream(lineString.split("\\s+->\\s+"))
                    .map(Point::new)
                    .collect(Collectors.toList());

            allLines.add(new Line(points.get(0), points.get(1)));
        }
        System.out.printf("transformed into %d lines\n", allLines.size());
    }
}

