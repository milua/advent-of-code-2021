package main.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Let's play bingo
 */
public class DayFour {
    private List<Integer> draws = Arrays.asList(17, 58, 52, 49, 72, 33, 55, 73, 27, 69, 88, 80, 9, 7, 59, 98, 63, 42, 84, 37, 87, 28, 97, 66, 79, 77, 61, 48, 83, 5, 94, 26, 70, 12, 51, 82, 99, 45, 22, 64, 10, 78, 13, 18, 15, 39, 8, 30, 68, 65, 40, 21, 6, 86, 90, 29, 60, 4, 38, 3, 43, 93, 44, 50, 41, 96, 20, 62, 19, 91, 23, 36, 47, 92, 76, 31, 67, 11, 0, 56, 95, 85, 35, 16, 2, 14, 75, 53, 1, 57, 81, 46, 71, 54, 24, 74, 89, 32, 25, 34);

    private List<String> bingoCardsRaw = Arrays.asList(
            "59,98,84,27,56\n" +
                    "17,35,18,64,34\n" +
                    "62,16,74,26,55\n" +
                    "21,99,1,19,93\n" +
                    "65,68,53,24,73\n"
            ,
            "1,86,98,16,6\n" +
                    "93,69,33,49,71\n" +
                    "54,43,77,29,47\n" +
                    "82,73,99,31,27\n" +
                    "28,48,36,89,20\n"
            ,
            "80,92,52,23,67\n" +
                    "47,38,4,25,65\n" +
                    "54,31,77,13,39\n" +
                    "18,70,17,22,24\n" +
                    "14,99,30,96,8\n"
            ,
            "88,97,17,48,71\n" +
                    "60,50,15,37,24\n" +
                    "78,6,79,56,91\n" +
                    "70,30,72,46,73\n" +
                    "41,42,32,7,59\n"
            ,
            "37,20,34,32,3\n" +
                    "48,40,4,27,42\n" +
                    "94,87,14,24,57\n" +
                    "17,18,90,44,76\n" +
                    "43,28,46,5,19\n"
            ,
            "3,69,88,77,74\n" +
                    "6,44,12,81,49\n" +
                    "73,23,32,97,53\n" +
                    "83,4,85,38,61\n" +
                    "10,87,50,60,47\n"
            ,
            "84,17,58,31,79\n" +
                    "25,97,35,72,16\n" +
                    "11,91,75,67,41\n" +
                    "6,85,27,44,86\n" +
                    "43,40,54,95,68\n"
            ,
            "70,55,88,22,50\n" +
                    "96,98,48,85,75\n" +
                    "95,72,8,26,14\n" +
                    "16,63,46,91,78\n" +
                    "93,3,83,99,21\n"
            ,
            "29,7,6,75,36\n" +
                    "37,93,23,63,65\n" +
                    "56,79,87,48,49\n" +
                    "27,24,80,53,33\n" +
                    "86,46,95,99,42\n"
            ,
            "33,30,72,99,65\n" +
                    "49,93,76,36,53\n" +
                    "26,35,86,97,12\n" +
                    "47,19,54,25,3\n" +
                    "75,34,50,8,95\n"
            ,
            "41,69,49,0,48\n" +
                    "73,9,72,61,85\n" +
                    "56,20,58,57,1\n" +
                    "12,82,38,21,46\n" +
                    "34,83,11,68,53\n"
            ,
            "54,79,35,24,33\n" +
                    "89,77,75,76,96\n" +
                    "94,2,38,39,40\n" +
                    "63,51,34,12,30\n" +
                    "20,21,70,26,23\n"
            ,
            "82,62,87,42,19\n" +
                    "94,65,18,4,33\n" +
                    "0,30,27,55,66\n" +
                    "76,46,78,14,48\n" +
                    "57,53,43,15,75\n"
            ,
            "94,38,96,44,46\n" +
                    "10,14,75,97,76\n" +
                    "7,61,56,36,1\n" +
                    "81,67,49,78,86\n" +
                    "31,65,88,24,63\n"
            ,
            "22,2,51,36,24\n" +
                    "78,62,67,13,84\n" +
                    "32,91,59,66,33\n" +
                    "73,80,54,3,85\n" +
                    "65,70,98,79,55\n"
            ,
            "80,1,23,70,47\n" +
                    "91,88,24,56,11\n" +
                    "98,79,72,31,86\n" +
                    "7,87,28,25,92\n" +
                    "74,20,62,46,71\n"
            ,
            "62,45,91,49,96\n" +
                    "73,3,57,30,95\n" +
                    "74,31,12,17,40\n" +
                    "53,39,63,55,1\n" +
                    "58,82,23,64,84\n"
            ,
            "11,71,60,51,63\n" +
                    "90,64,79,88,39\n" +
                    "65,13,76,66,26\n" +
                    "20,34,40,0,95\n" +
                    "21,72,62,83,77\n"
            ,
            "24,70,72,60,63\n" +
                    "53,69,94,74,57\n" +
                    "25,41,20,84,45\n" +
                    "76,68,16,15,18\n" +
                    "75,58,0,10,47\n"
            ,
            "17,23,90,8,4\n" +
                    "88,24,74,12,18\n" +
                    "62,99,67,49,92\n" +
                    "29,64,16,21,25\n" +
                    "9,19,30,60,53\n"
            ,
            "28,85,61,76,29\n" +
                    "15,33,89,48,1\n" +
                    "68,77,11,93,51\n" +
                    "87,59,8,5,54\n" +
                    "65,34,18,81,43\n"
            ,
            "53,9,31,23,35\n" +
                    "17,59,91,43,25\n" +
                    "7,90,5,33,58\n" +
                    "21,68,29,52,15\n" +
                    "86,3,48,11,26\n"
            ,
            "78,77,63,91,24\n" +
                    "40,31,54,17,72\n" +
                    "84,21,69,45,38\n" +
                    "89,12,70,42,65\n" +
                    "27,52,97,64,94\n"
            ,
            "36,23,33,20,70\n" +
                    "35,10,52,18,34\n" +
                    "22,19,98,93,5\n" +
                    "67,94,90,51,62\n" +
                    "38,6,53,64,76\n"
            ,
            "90,69,16,70,34\n" +
                    "57,94,3,61,36\n" +
                    "60,22,47,97,31\n" +
                    "30,8,4,84,91\n" +
                    "12,65,37,18,72\n"
            ,
            "12,93,39,1,96\n" +
                    "0,13,67,55,72\n" +
                    "84,9,30,40,62\n" +
                    "10,74,79,41,85\n" +
                    "51,52,47,98,75\n"
            ,
            "63,82,76,42,50\n" +
                    "40,75,85,10,99\n" +
                    "6,34,22,43,15\n" +
                    "87,57,79,66,55\n" +
                    "97,24,72,54,68\n"
            ,
            "68,39,48,66,81\n" +
                    "26,9,96,5,38\n" +
                    "22,1,57,30,98\n" +
                    "2,43,14,50,97\n" +
                    "56,37,62,13,29\n"
            ,
            "4,9,98,28,11\n" +
                    "21,20,10,39,69\n" +
                    "85,47,87,94,36\n" +
                    "88,75,35,22,91\n" +
                    "86,44,2,56,12\n"
            ,
            "98,65,26,91,86\n" +
                    "7,25,45,80,22\n" +
                    "39,2,95,69,46\n" +
                    "84,49,68,85,47\n" +
                    "23,90,40,4,44\n"
            ,
            "63,2,32,56,52\n" +
                    "30,11,33,10,70\n" +
                    "36,34,88,82,37\n" +
                    "62,57,40,28,96\n" +
                    "58,73,41,69,85\n"
            ,
            "8,27,64,80,19\n" +
                    "87,79,99,53,95\n" +
                    "84,6,31,22,3\n" +
                    "44,91,47,41,82\n" +
                    "16,74,43,29,70\n"
            ,
            "32,67,62,81,36\n" +
                    "47,61,74,60,57\n" +
                    "27,35,38,4,26\n" +
                    "34,72,2,21,90\n" +
                    "49,84,42,31,76\n"
            ,
            "3,53,26,35,12\n" +
                    "20,30,0,76,80\n" +
                    "96,46,89,83,48\n" +
                    "7,13,98,66,75\n" +
                    "97,82,55,5,68\n"
            ,
            "22,61,69,36,77\n" +
                    "95,53,4,21,94\n" +
                    "5,17,18,2,96\n" +
                    "0,81,56,31,66\n" +
                    "70,75,55,58,42\n"
            ,
            "97,10,40,80,43\n" +
                    "57,90,53,34,13\n" +
                    "38,7,47,86,89\n" +
                    "51,65,76,85,0\n" +
                    "48,62,28,42,35\n"
            ,
            "6,21,88,78,22\n" +
                    "30,90,65,53,66\n" +
                    "31,36,3,99,32\n" +
                    "52,13,69,68,72\n" +
                    "57,97,79,73,94\n"
            ,
            "77,76,81,94,20\n" +
                    "45,17,52,49,18\n" +
                    "98,56,21,32,80\n" +
                    "63,99,87,24,43\n" +
                    "61,1,16,3,40\n"
            ,
            "3,45,98,84,31\n" +
                    "99,23,90,71,27\n" +
                    "24,60,46,69,37\n" +
                    "83,62,6,36,49\n" +
                    "42,55,11,68,17\n"
            ,
            "60,22,98,46,0\n" +
                    "59,9,28,16,26\n" +
                    "56,33,43,93,31\n" +
                    "73,27,29,6,94\n" +
                    "13,12,51,61,45\n"
            ,
            "85,22,48,27,58\n" +
                    "86,23,65,19,91\n" +
                    "50,36,97,10,78\n" +
                    "15,9,3,72,96\n" +
                    "31,1,87,8,14\n"
            ,
            "79,48,30,50,77\n" +
                    "92,71,90,25,14\n" +
                    "39,45,98,1,84\n" +
                    "47,8,66,60,74\n" +
                    "80,75,55,62,35\n"
            ,
            "45,60,77,16,18\n" +
                    "78,21,23,44,56\n" +
                    "36,27,99,80,61\n" +
                    "81,71,75,58,5\n" +
                    "53,49,46,9,38\n"
            ,
            "56,6,53,79,33\n" +
                    "3,62,30,83,96\n" +
                    "1,34,12,44,47\n" +
                    "58,35,87,91,69\n" +
                    "20,85,0,60,4\n"
            ,
            "9,87,28,94,66\n" +
                    "3,10,27,13,54\n" +
                    "40,0,43,35,85\n" +
                    "67,34,81,92,58\n" +
                    "21,53,79,6,19\n"
            ,
            "23,72,9,1,57\n" +
                    "61,73,33,52,64\n" +
                    "7,21,92,84,46\n" +
                    "50,56,38,25,76\n" +
                    "75,67,47,81,37\n"
            ,
            "50,4,98,48,85\n" +
                    "46,39,45,93,69\n" +
                    "60,5,79,68,21\n" +
                    "31,67,8,74,16\n" +
                    "88,3,15,84,23\n"
            ,
            "53,61,99,17,25\n" +
                    "16,86,27,83,46\n" +
                    "9,75,67,19,10\n" +
                    "84,81,76,88,8\n" +
                    "49,97,79,3,21\n"
            ,
            "69,40,56,75,4\n" +
                    "34,16,79,46,77\n" +
                    "19,54,35,74,84\n" +
                    "73,50,20,47,10\n" +
                    "62,99,51,6,92\n"
            ,
            "53,79,80,96,45\n" +
                    "28,0,2,35,33\n" +
                    "51,70,34,90,72\n" +
                    "30,54,41,38,15\n" +
                    "91,73,97,23,49\n"
            ,
            "20,78,55,10,18\n" +
                    "61,89,14,2,17\n" +
                    "93,96,41,70,76\n" +
                    "19,37,47,80,71\n" +
                    "82,92,90,0,57\n"
            ,
            "29,40,64,62,32\n" +
                    "56,58,7,68,67\n" +
                    "16,76,4,50,13\n" +
                    "37,90,66,60,83\n" +
                    "33,97,25,80,54\n"
            ,
            "56,91,67,49,98\n" +
                    "85,15,25,1,32\n" +
                    "24,93,86,54,52\n" +
                    "22,73,23,63,94\n" +
                    "65,72,14,26,55\n"
            ,
            "74,38,19,20,11\n" +
                    "57,86,87,29,89\n" +
                    "13,21,75,85,44\n" +
                    "33,84,56,76,92\n" +
                    "52,37,64,72,73\n"
            ,
            "45,14,60,32,59\n" +
                    "66,49,16,2,94\n" +
                    "19,10,68,90,78\n" +
                    "95,8,93,61,24\n" +
                    "85,48,29,28,84\n"
            ,
            "6,74,4,42,86\n" +
                    "88,79,8,96,66\n" +
                    "63,85,89,9,12\n" +
                    "57,1,67,38,32\n" +
                    "87,26,71,78,46\n"
            ,
            "78,49,54,77,56\n" +
                    "18,4,50,14,23\n" +
                    "16,12,25,64,39\n" +
                    "75,2,22,41,37\n" +
                    "88,19,93,85,53\n"
            ,
            "79,6,52,48,37\n" +
                    "51,67,66,42,3\n" +
                    "63,43,39,56,91\n" +
                    "8,18,7,29,89\n" +
                    "55,71,45,36,38\n"
            ,
            "9,8,42,35,79\n" +
                    "11,62,7,93,68\n" +
                    "28,26,61,96,19\n" +
                    "29,88,81,43,98\n" +
                    "84,80,23,77,17\n"
            ,
            "90,21,51,43,60\n" +
                    "95,12,34,77,29\n" +
                    "75,82,47,92,15\n" +
                    "56,73,52,64,7\n" +
                    "17,85,94,41,46\n"
            ,
            "43,75,58,76,35\n" +
                    "37,41,65,60,14\n" +
                    "90,51,83,32,88\n" +
                    "26,99,16,68,64\n" +
                    "44,97,24,29,20\n"
            ,
            "50,32,90,95,27\n" +
                    "34,38,82,39,15\n" +
                    "60,66,68,40,22\n" +
                    "85,98,87,58,7\n" +
                    "30,54,97,11,33\n"
            ,
            "77,30,84,12,0\n" +
                    "34,6,5,70,44\n" +
                    "87,67,4,61,75\n" +
                    "31,96,52,57,8\n" +
                    "21,41,13,45,62\n"
            ,
            "6,26,69,27,75\n" +
                    "61,33,88,38,20\n" +
                    "9,56,70,98,82\n" +
                    "80,76,55,66,29\n" +
                    "97,84,42,77,73\n"
            ,
            "83,35,25,47,69\n" +
                    "70,31,93,56,57\n" +
                    "97,14,26,55,27\n" +
                    "51,39,98,77,17\n" +
                    "45,86,6,95,89\n"
            ,
            "18,9,29,14,38\n" +
                    "69,64,30,90,57\n" +
                    "75,97,80,94,44\n" +
                    "85,41,11,96,86\n" +
                    "33,81,58,26,49\n"
            ,
            "31,11,12,75,96\n" +
                    "68,85,95,2,47\n" +
                    "35,57,87,41,6\n" +
                    "65,50,74,25,59\n" +
                    "26,9,30,17,88\n"
            ,
            "54,59,23,46,37\n" +
                    "56,43,91,75,1\n" +
                    "18,96,11,84,14\n" +
                    "30,94,82,2,8\n" +
                    "67,90,99,33,34\n"
            ,
            "51,90,80,71,32\n" +
                    "73,18,8,35,58\n" +
                    "53,91,60,74,37\n" +
                    "76,9,25,17,31\n" +
                    "54,84,43,88,34\n"
            ,
            "20,8,27,64,40\n" +
                    "11,99,85,72,32\n" +
                    "62,7,55,83,35\n" +
                    "96,48,12,33,30\n" +
                    "73,4,21,16,75\n"
            ,
            "14,15,52,30,88\n" +
                    "97,94,59,56,77\n" +
                    "31,12,41,36,20\n" +
                    "62,3,2,38,82\n" +
                    "68,45,33,91,61\n"
            ,
            "4,11,9,89,60\n" +
                    "97,70,18,57,40\n" +
                    "98,75,6,50,88\n" +
                    "56,30,21,80,83\n" +
                    "7,73,65,23,69\n"
            ,
            "70,23,49,90,82\n" +
                    "1,68,95,33,76\n" +
                    "72,89,39,51,59\n" +
                    "8,65,88,73,24\n" +
                    "47,26,80,5,34\n"
            ,
            "13,50,15,43,51\n" +
                    "7,58,40,68,91\n" +
                    "62,18,47,79,42\n" +
                    "60,1,74,71,86\n" +
                    "25,53,36,10,70\n"
            ,
            "92,96,37,63,61\n" +
                    "49,94,65,13,23\n" +
                    "15,75,52,10,82\n" +
                    "30,59,14,43,48\n" +
                    "53,62,21,35,0\n"
            ,
            "79,84,95,93,41\n" +
                    "58,94,6,20,92\n" +
                    "88,0,78,16,21\n" +
                    "40,96,24,2,66\n" +
                    "85,87,13,14,80\n"
            ,
            "33,53,54,20,37\n" +
                    "18,88,70,61,85\n" +
                    "90,76,12,44,79\n" +
                    "81,69,9,98,74\n" +
                    "14,13,15,36,93\n"
            ,
            "61,46,67,24,98\n" +
                    "80,36,41,86,9\n" +
                    "82,75,40,42,58\n" +
                    "49,51,99,5,90\n" +
                    "91,97,26,20,56\n"
            ,
            "90,22,94,41,7\n" +
                    "13,16,51,44,32\n" +
                    "5,43,60,19,49\n" +
                    "38,96,23,12,79\n" +
                    "57,85,58,3,48\n"
            ,
            "52,3,40,90,43\n" +
                    "14,64,59,93,56\n" +
                    "99,94,61,72,46\n" +
                    "84,87,48,22,91\n" +
                    "2,67,35,76,92\n"
            ,
            "48,82,26,38,90\n" +
                    "50,98,30,76,60\n" +
                    "1,49,92,99,77\n" +
                    "59,97,22,47,93\n" +
                    "81,35,43,23,53\n"
            ,
            "41,5,57,29,2\n" +
                    "90,23,55,75,96\n" +
                    "48,60,86,67,8\n" +
                    "34,12,59,6,45\n" +
                    "89,1,44,49,76\n"
            ,
            "76,81,4,44,22\n" +
                    "89,84,85,70,11\n" +
                    "51,97,50,25,95\n" +
                    "31,27,21,40,87\n" +
                    "65,91,69,58,23\n"
            ,
            "96,42,98,38,52\n" +
                    "39,57,40,94,91\n" +
                    "87,79,23,36,82\n" +
                    "4,72,95,22,43\n" +
                    "51,73,59,15,44\n"
            ,
            "99,29,30,90,33\n" +
                    "60,61,65,8,56\n" +
                    "89,87,25,95,55\n" +
                    "6,39,69,98,20\n" +
                    "76,81,85,16,93\n"
            ,
            "86,35,92,90,19\n" +
                    "26,55,21,12,33\n" +
                    "3,82,41,47,15\n" +
                    "14,94,63,62,23\n" +
                    "95,65,2,0,72\n"
            ,
            "22,8,49,39,36\n" +
                    "63,7,61,92,51\n" +
                    "25,96,43,1,46\n" +
                    "28,64,59,47,27\n" +
                    "87,65,48,88,37\n"
            ,
            "58,59,93,23,70\n" +
                    "18,97,83,73,21\n" +
                    "90,14,13,95,45\n" +
                    "44,6,10,80,15\n" +
                    "92,56,26,76,52\n"
            ,
            "34,68,7,52,51\n" +
                    "17,25,97,35,78\n" +
                    "2,40,89,67,24\n" +
                    "73,37,45,0,64\n" +
                    "57,66,47,4,12\n"
            ,
            "11,35,14,69,13\n" +
                    "86,90,2,19,27\n" +
                    "70,0,6,31,98\n" +
                    "64,23,54,88,26\n" +
                    "94,43,59,71,36\n"
            ,
            "28,9,67,39,20\n" +
                    "16,44,47,69,96\n" +
                    "19,45,30,91,68\n" +
                    "75,56,37,35,52\n" +
                    "27,42,93,43,84\n"
            ,
            "24,67,39,70,93\n" +
                    "71,72,12,85,1\n" +
                    "77,59,66,5,76\n" +
                    "54,13,35,40,82\n" +
                    "51,25,64,6,19\n"
            ,
            "65,36,92,51,74\n" +
                    "55,90,68,9,97\n" +
                    "28,56,35,34,73\n" +
                    "50,10,61,37,30\n" +
                    "79,49,96,18,1\n"
            ,
            "57,8,17,51,19\n" +
                    "86,97,21,84,20\n" +
                    "32,44,33,27,62\n" +
                    "3,76,70,58,79\n" +
                    "36,74,75,65,71\n"
            ,
            "24,65,37,29,66\n" +
                    "26,60,49,45,61\n" +
                    "23,22,83,71,10\n" +
                    "46,59,86,40,12\n" +
                    "64,74,27,8,78\n"
            ,
            "63,79,80,54,68\n" +
                    "16,89,60,96,31\n" +
                    "6,91,32,37,86\n" +
                    "93,20,61,70,21\n" +
                    "58,88,11,15,39\n"
            ,
            "36,44,75,3,29\n" +
                    "58,32,84,37,48\n" +
                    "76,99,65,91,24\n" +
                    "22,20,42,57,49\n" +
                    "50,85,52,2,54\n"
            ,
            "77,65,38,15,12\n" +
                    "50,53,10,34,40\n" +
                    "87,60,4,68,71\n" +
                    "5,35,28,63,66\n" +
                    "11,86,9,8,49\n"
            ,
            "3,71,46,10,1\n" +
                    "83,12,52,99,24\n" +
                    "96,87,85,51,33\n" +
                    "11,69,62,34,41\n" +
                    "88,22,89,21,49\n"
            ,
            "55,0,82,40,48\n" +
                    "71,32,3,90,92\n" +
                    "39,69,63,86,60\n" +
                    "51,36,66,12,46\n" +
                    "73,57,58,33,94\n");

    private List<BingoCard> bingoCards = new ArrayList<>();
    private int round = 0;

    public DayFour() {
        initializeBingoCards();
    }

    public void run() {
        System.out.println("========================");
        System.out.println("Day 4 running...");
        System.out.println("========================");

        winTheGame();
        System.out.println("-----------------------");
        loseTheGame();
    }

    private void loseTheGame() {
        System.out.println("Part Two");
        System.out.println("Lose the bingo");

        var losingCard = bingoCards;

        BingoCard isBingo = checkBingo();

        while (losingCard.size() > 1 && round < draws.size()) {
            drawNumber();

            losingCard = losingCard.stream().filter(card -> !card.hasBingo()).collect(Collectors.toList());
        }
        while(!losingCard.get(0).hasBingo() && round < draws.size()){
            drawNumber();
        }
        int sumOfAllUnmarked = losingCard.get(0).sumAllUnmarked();

        System.out.println("Sum of all unmarked: " + sumOfAllUnmarked);
        System.out.println("current draw: " + draws.get(round - 1));
        System.out.println("Result: " + sumOfAllUnmarked * draws.get(round - 1));
    }

    private void winTheGame() {
        System.out.println("Part One");
        System.out.println("Win the bingo");
        drawNumber();
        drawNumber();
        drawNumber();
        drawNumber();
        drawNumber();

        BingoCard isBingo = checkBingo();

        checkIsBingo(isBingo);

        while (isBingo == null && round < draws.size()) {
            drawNumber();

            isBingo = checkBingo();
        }
    }

    private void checkIsBingo(BingoCard isBingo) {
        if (isBingo != null) {
           //  System.out.println("Bingo! Card: " + isBingo.toString());
            int sumOfAllUnmarked = isBingo.sumAllUnmarked();
            System.out.println("Sum of all unmarked: " + sumOfAllUnmarked);
            System.out.println("current draw: " + draws.get(round - 1));
            System.out.println("Result: " + sumOfAllUnmarked * draws.get(round - 1));
        }
    }

    private BingoCard checkBingo() {
        BingoCard bingoCard = null;
        for (BingoCard card : bingoCards) {
            if(card.hasBingo()) {
                bingoCard = card;
            }
        }
        return bingoCard;
    }

    private void drawNumber() {
        // System.out.println("draw: " + draws.get(round));
        for (BingoCard card : bingoCards) {
            card.checkDrawnNumber(draws.get(round));
        }
        round++;
    }

    private void initializeBingoCards() {
        for (String bingoRaw : bingoCardsRaw) {
            List<BingoNumber[]> converted = Arrays.stream(bingoRaw.split("\n"))
                    // int values
                    .map(rowString -> Arrays.stream(rowString.split(","))
                            .map(Integer::parseInt).map(BingoNumber::new).toArray(BingoNumber[]::new)).collect(Collectors.toList());

            bingoCards.add(new BingoCard(converted.get(0), converted.get(1), converted.get(2), converted.get(3), converted.get(4)));
        }
    }
}

class BingoCard {
    private BingoNumber[][] card = new BingoNumber[5][5];

    public BingoCard(BingoNumber[] firstRow, BingoNumber[] secondRow, BingoNumber[] thirdRow, BingoNumber[] forthRow, BingoNumber[] fifthRow) {
        card[0] = firstRow;
        card[1] = secondRow;
        card[2] = thirdRow;
        card[3] = forthRow;
        card[4] = fifthRow;
    }

    void checkDrawnNumber(int drawnNumber) {
        for (BingoNumber[] bingoNumbers : card) {
            for (BingoNumber bingoNumber : bingoNumbers) {
                bingoNumber.checkNumber(drawnNumber);
            }
        }
    }

    boolean hasBingo() {
        return hasOneFullRow() || hasOneFullColumn();
    }

    private boolean hasOneFullRow() {
        final var isFirstRowFull = card[0][0].isMarked() && card[0][1].isMarked() && card[0][2].isMarked() && card[0][3].isMarked() && card[0][4].isMarked();
        final var isSecondRowFull = card[1][0].isMarked() && card[1][1].isMarked() && card[1][2].isMarked() && card[1][3].isMarked() && card[1][4].isMarked();
        final var isThirdRowFull = card[2][0].isMarked() && card[2][1].isMarked() && card[2][2].isMarked() && card[2][3].isMarked() && card[2][4].isMarked();
        final var isForthRowFull = card[3][0].isMarked() && card[3][1].isMarked() && card[3][2].isMarked() && card[3][3].isMarked() && card[3][4].isMarked();
        final var isFifthRowFull = card[4][0].isMarked() && card[4][1].isMarked() && card[4][2].isMarked() && card[4][3].isMarked() && card[4][4].isMarked();

        return isFirstRowFull || isSecondRowFull || isThirdRowFull || isForthRowFull || isFifthRowFull;
    }

    private boolean hasOneFullColumn() {
        final var isFirstColumnFull = card[0][0].isMarked() && card[1][0].isMarked() && card[2][0].isMarked() && card[3][0].isMarked() && card[4][0].isMarked();
        final var isSecondColumnFull = card[0][1].isMarked() && card[1][1].isMarked() && card[2][1].isMarked() && card[3][1].isMarked() && card[4][1].isMarked();
        final var isThirdColumnFull = card[0][2].isMarked() && card[1][2].isMarked() && card[2][2].isMarked() && card[3][2].isMarked() && card[4][2].isMarked();
        final var isForthColumnFull = card[0][3].isMarked() && card[1][3].isMarked() && card[2][3].isMarked() && card[3][3].isMarked() && card[4][3].isMarked();
        final var isFifthColumnFull = card[0][4].isMarked() && card[1][4].isMarked() && card[2][4].isMarked() && card[3][4].isMarked() && card[4][4].isMarked();

        return isFirstColumnFull || isSecondColumnFull || isThirdColumnFull || isForthColumnFull || isFifthColumnFull;
    }

    public int sumAllUnmarked() {
        int sum = 0;
        for (BingoNumber[] bingoNumbers : card) {
            for (BingoNumber bingoNumber : bingoNumbers) {
                if (!bingoNumber.isMarked()) {
                    sum = sum + bingoNumber.getValue();
                }
            }
        }
        return sum;
    }

    @Override
    public String toString() {
        return "main.java.BingoCard: [\n" +
                card[0][0] + " " + card[0][1] + " " + card[0][2] + " " + card[0][3] + " " + card[0][4] + "\n" +
                card[1][0] + " " + card[1][1] + " " + card[1][2] + " " + card[1][3] + " " + card[1][4] + "\n" +
                card[2][0] + " " + card[2][1] + " " + card[2][2] + " " + card[2][3] + " " + card[2][4] + "\n" +
                card[3][0] + " " + card[3][1] + " " + card[3][2] + " " + card[3][3] + " " + card[3][4] + "\n" +
                card[4][0] + " " + card[4][1] + " " + card[4][2] + " " + card[4][3] + " " + card[4][4] + "\n" +
                "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BingoCard bingoCard = (BingoCard) o;
        return Arrays.deepEquals(card, bingoCard.card);
    }

    @Override
    public int hashCode() {
        return Arrays.deepHashCode(card);
    }
}

class BingoNumber {
    private int value;
    private boolean marked = false;

    public BingoNumber(int value) {
        this.value = value;
    }

    boolean isMarked() {
        return marked;
    }

    void checkNumber(int number) {
        if (number == value) {
            marked = true;
        }
    }

    int getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return "" + value;
    }
}