/*-
 * #%L
 * Code Kata
 * %%
 * Copyright (C) 2019 Chrysocode
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 * #L%
 */

package kata;

import org.junit.jupiter.api.Test;

import static testasyouthink.TestAsYouThink.resultOf;

class KataTest {

    @Test
    void should_find_a_common_year_given_2019_as_not_divisible_by_4() {
        resultOf(() -> isLeapYear(2019)).isFalse();
    }

    @Test
    void should_find_a_leap_year_given_2008_as_divisible_by_4_but_not_100() {
        resultOf(() -> isLeapYear(2008)).isTrue();
    }

    @Test
    void should_find_a_leap_year_given_2016_as_divisible_by_4_but_not_100() {
        resultOf(() -> isLeapYear(2016)).isTrue();
    }

    @Test
    void should_find_a_common_year_given_1900_as_divisible_by_4_and_100() {
        resultOf(() -> isLeapYear(1900)).isFalse();
    }

    boolean isLeapYear(int year) {
        return isDivisibleBy4ButNot100(year);
    }

    private boolean isDivisibleBy4ButNot100(int year) {
        return year % 4 == 0 && year % 100 != 0;
    }
}
