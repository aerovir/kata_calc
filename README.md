# kata_calc
Calc for test task to kata
# Тестовое задание
Описание:
Консольное приложение “Калькулятор”. Приложение читает из консоли введенные пользователем строки, числа, арифметические операции проводимые между ними и выводить в консоль результат их выполнения.

Калькулятор умеет выполнять операции сложения, вычитания, умножения и деления с двумя числами: a + b, a - b, a * b, a / b. Данные передаются в одну строку. Решения, в которых каждое число и арифмитеческая операция передаются с новой строки считаются неверными.
Калькулятор умеет работать как с арабскими (1,2,3,4,5…), так и с римскими (I,II,III,IV,V…) числами.
Калькулятор принимает на вход числа от 1 до 10 включительно, не более. На выходе числа не ограничиваются по величине и могут быть любыми.
Калькулятор умеет работать только с целыми числами.
Калькулятор умеет работать только с арабскими или римскими цифрами одновременно, при вводе пользователем строки вроде 3 + II калькулятор должен выбросить исключение и прекратить свою работу.
При вводе римских чисел, ответ будет выведен римскими цифрами, соответственно, при вводе арабских - ответ будет арабскими.
При вводе пользователем неподходящих чисел приложение выдаст сообщение и завершает свою работу.
При вводе пользователем строки, не соответствующей одной из вышеописанных арифметических операций, приложение выдаст сообщение и завершает свою работу.
Результатом операции деления является целое число, остаток отбрасывается. 
Результатом работы калькулятора с арабскими числами могут быть отрицательные числа и ноль. Результатом работы калькулятора с римскими числами могут быть только положительные числа, если результат работы меньше единицы, выбрасывается исключение
