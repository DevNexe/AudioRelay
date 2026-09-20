package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class BF extends C1263cB {
    public static String[] A08 = {"bHvO3zM", "7z8VpEP", "iw2Y0c", "LME8njBPiXs011hhslbtp", "9K0lNzbR5X2b0vS5", "Pt0EnZUFnGQLsNks8pQcEgn0FivkNzUh", "t6anbflpJj2CGicCnIMdWTRCydsD", "D9TL9YTSSd0lWzGeUvgWfvwaUF0YdAOx"};
    public float A00;
    public int A01;
    public int A02;
    public BG A03;
    public int[] A04;
    public final C1075Xy A05;
    public final PT A06;
    public final PU A07;

    public BF(C1075Xy c1075Xy, PU pu, PT pt) {
        super(c1075Xy);
        this.A02 = 0;
        this.A00 = 50.0f;
        this.A05 = c1075Xy;
        this.A07 = pu;
        this.A06 = pt;
        this.A01 = -1;
        this.A03 = new BG(this, this.A05);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    /* JADX WARN: Code duplicated, block: B:15:0x0047  */
    /* JADX WARN: Code duplicated, block: B:17:0x004b  */
    /* JADX WARN: Code duplicated, block: B:20:0x0055  */
    /* JADX WARN: Code duplicated, block: B:22:0x0061  */
    /* JADX WARN: Code duplicated, block: B:24:0x0067  */
    /* JADX WARN: Code duplicated, block: B:27:0x006b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0082  */
    /* JADX WARN: Code duplicated, block: B:35:0x0090  */
    /* JADX WARN: Code duplicated, block: B:36:0x0096  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:44:0x00db  */
    /* JADX WARN: Code duplicated, block: B:46:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:49:0x0108  */
    /* JADX WARN: Code duplicated, block: B:52:0x0117  */
    /* JADX WARN: Code duplicated, block: B:55:0x008b A[EDGE_INSN: B:55:0x008b->B:33:0x008b BREAK  A[LOOP:0: B:26:0x0069->B:43:0x00d8], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x011d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x007c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x00d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x00d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x00d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:6:0x001c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        if (r0 == 0) goto L9;
     */
    @Override // com.facebook.ads.redexgen.X.C4T
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A1J(com.facebook.ads.redexgen.X.C03424b r17, com.facebook.ads.redexgen.X.C03494i r18, int r19, int r20) {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.BF.A1J(com.facebook.ads.redexgen.X.4b, com.facebook.ads.redexgen.X.4i, int, int):void");
    }

    @Override // com.facebook.ads.redexgen.X.C1263cB, com.facebook.ads.redexgen.X.C4T
    public final void A1t(int i) {
        A2F(i, this.A02);
    }

    @Override // com.facebook.ads.redexgen.X.C1263cB, com.facebook.ads.redexgen.X.C4T
    public final void A21(F9 f9, C03494i c03494i, int i) {
        this.A03.A0A(i);
        A1L(this.A03);
    }

    public final void A2K(double d) {
        if (d <= 0.0d) {
            d = 1.0d;
        }
        this.A00 = (float) (50.0d / d);
        this.A03 = new BG(this, this.A05);
    }

    public final void A2L(int i) {
        this.A01 = i;
    }

    public final void A2M(int i) {
        this.A02 = i;
    }
}
