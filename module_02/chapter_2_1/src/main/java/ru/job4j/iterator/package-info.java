/**
 * 5.1.1. Итератор для двухмерного массива int[][] [#9539]
 * Администратор,  08.10.17 9:44
 * Необходимо создать интератор для двухмерного массива.
 *
 *  DoubleArrayIterator Итератор двумерного массива int.
 *  DoubleArrayIntegerIterator Итератор двумерного массива Integer (могут присутствовать null значения).
 *  -----------------------------------------------------------
 *
 *  5.1.2. Создать итератор четные числа [#150]
 *  Администратор,  06.10.17 8:53
 *  Создать итератор возвращающий только четные цифры.
 *  Итератор должен принимать список произвольных чисел.
 *
 *  public EvenIt(final int[] numbers) {
 *  Iterator it = new EventIt(new int[] {4, 2, 1, 1});
 *  методы
 *  it.next() - возвращают только четные числа. В этом примере - это 4 и 2.
 *  it.hasNext() - возвращает true, только если в массиве есть четные перед указателем.
 *
 *  EvenIt - Итератор, возвращающий только четные значения.
 *  -----------------------------------------------------------
 *
 *  5.1.3. Создать итератор простые числа. [#151]
 *  Создать итератор возвращающий только простые числа. (числа которые деляться только на 1 и на себя).
 *  Итератор должен принимать список произвольных чисел.
 *
 *  public PrimeIt(final int[] numbers) {
 *  Iterator it = new EventIt(new int[] {3, 4, 5, 6, 7});
 *  методы
 *  it.next() - возвращают только простые числа. В этом примере - это 3, 5 и 7.
 *  it.hasNext() - возвращает true, только если в массиве есть простые числа перед указателем.
 *
 *  PrimeIt - Итератор возвращающий только простые числа.
 *  -----------------------------------------------------------\
 *
 *  5.1.4. Создать convert(Iterator<Iterator>) [#152]
 *  Реализовать класс с методом Iterator<Integer> convert(Iterator<Iterator<Integer>> it).
 *  Метод convert должен принимать объект итератор итератор и возвращать Итератор чисел.
 *
 *  Iterator<Iterator<Integer> - ((4 2 0 4 6 4 9), (0 9 8 7 5), (1 3 5 6 7 0 9 8 4))
 *  Метод должен возвращать
 *  Iterator<Integer> - (4 2 0 4 6 4 9 0 9 8 7 5 1 3 5 6 7 0 9 8 4)
 *  Метод не должен копировать данные. Нужно реализовать итератор, который будет пробегать по вложенными итераторам без копирования данных.
 *
 * Converter - Ковертер списка итераторов в итератор.
 *
 *
 */
package ru.job4j.iterator;