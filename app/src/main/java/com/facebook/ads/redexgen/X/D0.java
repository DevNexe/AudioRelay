package com.facebook.ads.redexgen.X;

import java.io.IOException;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class D0 {
    public static String[] A02 = {"6bTYjI7xiahg1uqAV8eewLZrNfj9ZPj", "ngeXPKLRRDCcDwFHaGe0eDwdNk9MsKP0", "GKtDxJ6", "TMKYymqQa", "6hy2FBj", "omQP2HfChml3facH7odpRvVYds2Y", "0Yg", "2mziQBXjxxZN6M5afK2REUi5LMQCqiEi"};
    public int A00;
    public final C0679Ij A01 = new C0679Ij(8);

    private long A00(InterfaceC0536Cd interfaceC0536Cd) throws InterruptedException, IOException {
        interfaceC0536Cd.AD7(this.A01.A00, 0, 1);
        int i = this.A01.A00[0] & 255;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int i2 = 128;
        int i3 = 0;
        while (length == 0) {
            i2 >>= 1;
            if (A02[6].length() == 30) {
                throw new RuntimeException();
            }
            A02[1] = "eov1UmgRTS2J9JWiL8HKDN2YxzkNqP4T";
            i3++;
        }
        int length = i2 ^ (-1);
        int i4 = i & length;
        interfaceC0536Cd.AD7(this.A01.A00, 1, i3);
        for (int i5 = 0; i5 < i3; i5++) {
            int i6 = i4 << 8;
            if (A02[7].charAt(16) == 'G') {
                throw new RuntimeException();
            }
            A02[1] = "09Vxb0YRh5GFDnmrENphsjvB8xYQhkFk";
            int i7 = i5 + 1;
            i4 = i6 + (this.A01.A00[i7] & 255);
        }
        this.A00 += i3 + 1;
        return i4;
    }

    public final boolean A01(InterfaceC0536Cd interfaceC0536Cd) throws InterruptedException, IOException {
        long jA6t = interfaceC0536Cd.A6t();
        long j = 1024;
        if (jA6t != -1 && jA6t <= 1024) {
            j = jA6t;
        }
        int i = (int) j;
        boolean z = false;
        interfaceC0536Cd.AD7(this.A01.A00, 0, 4);
        long jA0M = this.A01.A0M();
        this.A00 = 4;
        while (jA0M != 440786851) {
            int i2 = this.A00 + 1;
            this.A00 = i2;
            if (i2 == i) {
                return false;
            }
            interfaceC0536Cd.AD7(this.A01.A00, 0, 1);
            long tag = this.A01.A00[0] & 255;
            jA0M = ((jA0M << 8) & (-256)) | tag;
        }
        long jA00 = A00(interfaceC0536Cd);
        long j2 = this.A00;
        if (jA00 == Long.MIN_VALUE) {
            return false;
        }
        if (jA6t != -1 && j2 + jA00 >= jA6t) {
            return false;
        }
        while (true) {
            int i3 = this.A00;
            if (i3 >= j2 + jA00) {
                return ((long) i3) == j2 + jA00;
            }
            if (A00(interfaceC0536Cd) == Long.MIN_VALUE) {
                return z;
            }
            long jA01 = A00(interfaceC0536Cd);
            if (jA01 < 0 || jA01 > 2147483647L) {
                return false;
            }
            if (jA01 != 0) {
                int i4 = (int) jA01;
                interfaceC0536Cd.A3K(i4);
                this.A00 += i4;
            }
            z = false;
        }
    }
}
