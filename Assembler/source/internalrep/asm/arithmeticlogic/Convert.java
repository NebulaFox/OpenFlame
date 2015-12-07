/*
 * The OpenFlame Project <http://stuartmscott.github.io/OpenFlame/>.
 *
 * Copyright (C) 2015 OpenFlame Project
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package internalrep.asm.arithmeticlogic;

public class Convert extends AluInst {

    public Convert(boolean isFloat, int srcReg, int destReg, String comment) {
        // Changes the value in srcReg to float (if isFloat) or to an integer (if !isFloat)
        super(isFloat, CONVERT, srcReg, 0, destReg, comment);
    }

    public String toString() {
        return "convert r" + mSource1Index + " r" + mDestinationIndex + super.toString();
    }

}
