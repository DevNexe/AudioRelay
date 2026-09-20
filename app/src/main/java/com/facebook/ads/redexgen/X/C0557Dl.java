package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Dl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0557Dl {
    public static String[] A0G = {"Ap6BNJVrmScnFk1hMNs3gk3nfiOqRLL3", "ykUqwa9hjGiITCeS7mR9oTL7PlhG", "aa4WgtRMvf8T1H", "JRczJFV5HPZSgdF19FYO330C4qz", "DshyegtLBVWJb272GUnrCLDL902Y6CT4", "mdvT8We7lZzQ3otG", "HTCQc9aRCuJwCScXqz5EEwOn0qroPb", "au3IbZji4KTf1MJXqcScv4"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public C0674Ie A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;

    public C0557Dl() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:21:0x005a  */
    /* JADX WARN: Code duplicated, block: B:35:0x0095  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:? A[RETURN, SYNTHETIC] */
    public boolean A00(C0557Dl c0557Dl) {
        boolean z;
        boolean z2;
        int i;
        if (this.A0F) {
            if (!c0557Dl.A0F || this.A03 != c0557Dl.A03 || this.A07 != c0557Dl.A07) {
                return true;
            }
            boolean z3 = this.A0C;
            if (A0G[5].length() != 16) {
                throw new RuntimeException();
            }
            String[] strArr = A0G;
            strArr[4] = "Brw5i8rGHBW71K33du4zJvIjk6EmRJH9";
            strArr[6] = "RwmcRua1hejs2s0vOAX6lsL4rGT6f6";
            if (z3 != c0557Dl.A0C) {
                return true;
            }
            boolean z4 = this.A0B;
            String[] strArr2 = A0G;
            if (strArr2[7].length() != strArr2[3].length()) {
                A0G[0] = "7XqbLIMHqeF4ACGkKHFSPL5n1PTTECL3";
                if (z4) {
                    if (c0557Dl.A0B && this.A0A != c0557Dl.A0A) {
                        return true;
                    }
                }
            } else {
                String[] strArr3 = A0G;
                strArr3[4] = "s1RbcqNPGPspLhuk1KaIYEncshphzTy6";
                strArr3[6] = "W53axkGfsU0giUFzw9bYQfJRO0aqoK";
                if (z4) {
                    if (c0557Dl.A0B) {
                        return true;
                    }
                }
            }
            int i2 = this.A05;
            int i3 = c0557Dl.A05;
            if (i2 != i3 && (i2 == 0 || i3 == 0)) {
                return true;
            }
            if (this.A09.A04 == 0) {
                int i4 = c0557Dl.A09.A04;
                if (A0G[0].charAt(30) != 'd') {
                    String[] strArr4 = A0G;
                    strArr4[7] = "5biFR31Ww6IVJRQpoWySMi";
                    strArr4[3] = "JIZ9t5zNUO5N5gZGQiecPim8SVz";
                    if (i4 == 0) {
                        i = this.A06;
                        if (A0G[5].length() != 16) {
                            A0G[5] = "2WzXkDzYE8eWwBtW";
                            if (i != c0557Dl.A06) {
                                return true;
                            }
                        } else if (i != c0557Dl.A06) {
                            return true;
                        }
                        if (this.A02 != c0557Dl.A02) {
                            return true;
                        }
                    }
                } else if (i4 == 0) {
                    i = this.A06;
                    if (A0G[5].length() != 16) {
                        A0G[5] = "2WzXkDzYE8eWwBtW";
                        if (i != c0557Dl.A06) {
                            return true;
                        }
                    } else if (i != c0557Dl.A06) {
                        return true;
                    }
                    if (this.A02 != c0557Dl.A02) {
                        return true;
                    }
                }
            }
            if ((this.A09.A04 == 1 && c0557Dl.A09.A04 == 1 && (this.A00 != c0557Dl.A00 || this.A01 != c0557Dl.A01)) || (z = this.A0E) != (z2 = c0557Dl.A0E)) {
                return true;
            }
            if (z && z2 && this.A04 != c0557Dl.A04) {
                return true;
            }
        }
        return false;
    }

    public final void A02() {
        this.A0D = false;
        this.A0F = false;
    }

    public final void A03(int i) {
        this.A08 = i;
        this.A0D = true;
    }

    public final void A04(C0674Ie c0674Ie, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, int i5, int i6, int i7, int i8, int i9) {
        this.A09 = c0674Ie;
        this.A05 = i;
        this.A08 = i2;
        this.A03 = i3;
        this.A07 = i4;
        this.A0C = z;
        this.A0B = z2;
        this.A0A = z3;
        this.A0E = z4;
        this.A04 = i5;
        this.A06 = i6;
        this.A02 = i7;
        this.A00 = i8;
        this.A01 = i9;
        this.A0F = true;
        this.A0D = true;
    }

    public final boolean A05() {
        int i;
        return this.A0D && ((i = this.A08) == 7 || i == 2);
    }
}
