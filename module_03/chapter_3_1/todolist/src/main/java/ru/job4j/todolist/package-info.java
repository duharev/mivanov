/**
 *
 * Приложение TODO_list [#3786]
 *
 * 1. одна таблица в базе item. id, desc. created, done.
 * 2. веб приложение должно иметь одну страницу index.html. 
 * 3. все данные на форму загружаються через ajax.
 * 4. в верху форма. добавить новое задание. описание.
 * 5. список всех заданий. и галка выполено или нет.
 * 6. вверху добавить галку. показать все. если включена. то показывать все. если нет. то только те что не выполены done = false.
 * 7. данные должны сохраняться через hibernate, 
 *
 * ***
 * Данные обновляются при добавлении нового задания и нажатия на кнопку "Update from server".
 * При установке/снятии флажка "Show done tasks" данные с сервера не загружаются.
 *
 *
 */
package ru.job4j.todolist;