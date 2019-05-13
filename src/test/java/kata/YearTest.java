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

class YearTest {

    @Test
    void should_find_a_common_year_given_2019_as_not_divisible_by_4() {
        resultOf(() -> new Year(2019).isLeap()).isFalse();
    }

    @Test
    void should_find_a_leap_year_given_2008_as_divisible_by_4_but_not_100() {
        resultOf(() -> new Year(2008).isLeap()).isTrue();
    }

    @Test
    void should_find_a_leap_year_given_2016_as_divisible_by_4_but_not_100() {
        resultOf(() -> new Year(2016).isLeap()).isTrue();
    }

    @Test
    void should_find_a_common_year_given_1900_as_divisible_by_4_and_100() {
        resultOf(() -> new Year(1900).isLeap()).isFalse();
    }

    @Test
    void should_find_a_leap_year_given_2000_as_divisible_by_400() {
        resultOf(() -> new Year(2000).isLeap()).isTrue();
    }
}
