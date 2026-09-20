package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.TreeSet;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class IB {
    public static byte[] A05;
    public static String[] A06 = {"MBceJWRKAgeQJNY3ZRBdRhYJgpL3jkFQ", "518xlpwWcjlWASul8lHAahT8PqQVPF3u", "9RLjFZMlaqPSYVxgrCr3N29CAF4vaCFh", "Nd9PnywG3g8LluWsmNbg8PXBjZKSlX8G", "s", "C1TdeuC5gtnvKYkq95Rq", "MkXsOhuicHq9DXlwRCZefot2VxsvXJH1", "VJm3srbtmlXEw3gKHWc"};
    public boolean A01;
    public final int A02;
    public final String A03;
    public C0989Un A00 = C0989Un.A04;
    public final TreeSet<C0987Ul> A04 = new TreeSet<>();

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 28);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A05 = new byte[]{70, 0, 7, 15, 10, 3, 2, 72, 58, 110, 117, 58, 0, 55, 60, 51, 63, 59, 60, 53, 114, 61, 52, 114};
    }

    static {
        A02();
    }

    public IB(int i, String str) {
        this.A02 = i;
        this.A03 = str;
    }

    public static IB A00(int id, DataInputStream dataInputStream) throws IOException {
        IB ib = new IB(dataInputStream.readInt(), dataInputStream.readUTF());
        if (id < 2) {
            long j = dataInputStream.readLong();
            IG mutations = new IG();
            IF.A05(mutations, j);
            ib.A0F(mutations);
        } else {
            C0989Un c0989UnA00 = C0989Un.A00(dataInputStream);
            if (A06[4].length() == 13) {
                throw new RuntimeException();
            }
            A06[1] = "w2ExrNvXNhLYBLEt12rGyqcfRXmaXRhw";
            ib.A00 = c0989UnA00;
        }
        return ib;
    }

    public final int A03(int result) {
        int iHashCode = (this.A02 * 31) + this.A03.hashCode();
        if (result < 2) {
            long jA00 = IF.A00(this.A00);
            return (iHashCode * 31) + ((int) ((jA00 >>> 32) ^ jA00));
        }
        return (iHashCode * 31) + this.A00.hashCode();
    }

    public final long A04(long queryEndPosition, long currentEndPosition) {
        C0987Ul c0987UlA06 = A06(queryEndPosition);
        if (c0987UlA06.A01()) {
            long j = -Math.min(c0987UlA06.A02() ? Long.MAX_VALUE : c0987UlA06.A01, currentEndPosition);
            if (A06[3].charAt(14) != 'W') {
                throw new RuntimeException();
            }
            String[] strArr = A06;
            strArr[7] = "ZNj15xTvoSD0UBJTiXr";
            strArr[5] = "u99g5dbJfvVcRXaISwTW";
            return j;
        }
        long j2 = queryEndPosition + currentEndPosition;
        long jMax = c0987UlA06.A02 + c0987UlA06.A01;
        if (jMax < j2) {
            for (C0987Ul c0987Ul : this.A04.tailSet(c0987UlA06, false)) {
                if (c0987Ul.A02 > jMax) {
                    break;
                }
                jMax = Math.max(jMax, c0987Ul.A02 + c0987Ul.A01);
                if (jMax >= j2) {
                    break;
                }
            }
        }
        return Math.min(jMax - queryEndPosition, currentEndPosition);
    }

    public final IE A05() {
        return this.A00;
    }

    public final C0987Ul A06(long j) {
        C0987Ul c0987UlA01 = C0987Ul.A01(this.A03, j);
        C0987Ul c0987UlFloor = this.A04.floor(c0987UlA01);
        if (c0987UlFloor != null && c0987UlFloor.A02 + c0987UlFloor.A01 > j) {
            return c0987UlFloor;
        }
        C0987Ul c0987UlCeiling = this.A04.ceiling(c0987UlA01);
        if (c0987UlCeiling == null) {
            return C0987Ul.A02(this.A03, j);
        }
        return C0987Ul.A03(this.A03, j, c0987UlCeiling.A02 - j);
    }

    public final C0987Ul A07(C0987Ul c0987Ul) throws I2 {
        IK.A04(this.A04.remove(c0987Ul));
        C0987Ul c0987UlA08 = c0987Ul.A08(this.A02);
        if (c0987Ul.A03.renameTo(c0987UlA08.A03)) {
            this.A04.add(c0987UlA08);
            return c0987UlA08;
        }
        throw new I2(A01(12, 12, 78) + c0987Ul.A03 + A01(8, 4, 6) + c0987UlA08.A03 + A01(0, 8, 122));
    }

    public final TreeSet<C0987Ul> A08() {
        return this.A04;
    }

    public final void A09(C0987Ul c0987Ul) {
        this.A04.add(c0987Ul);
    }

    public final void A0A(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(this.A02);
        dataOutputStream.writeUTF(this.A03);
        this.A00.A09(dataOutputStream);
    }

    public final void A0B(boolean z) {
        this.A01 = z;
    }

    public final boolean A0C() {
        return this.A04.isEmpty();
    }

    public final boolean A0D() {
        return this.A01;
    }

    public final boolean A0E(I8 i8) {
        if (this.A04.remove(i8)) {
            i8.A03.delete();
            return true;
        }
        return false;
    }

    public final boolean A0F(IG ig) {
        C0989Un c0989Un = this.A00;
        this.A00 = this.A00.A08(ig);
        return !this.A00.equals(c0989Un);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IB ib = (IB) obj;
        if (this.A02 == ib.A02 && this.A03.equals(ib.A03)) {
            TreeSet<C0987Ul> treeSet = this.A04;
            if (A06[4].length() == 13) {
                throw new RuntimeException();
            }
            A06[4] = "qw9AeUbTiw";
            if (treeSet.equals(ib.A04) && this.A00.equals(ib.A00)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (A03(Integer.MAX_VALUE) * 31) + this.A04.hashCode();
    }
}
