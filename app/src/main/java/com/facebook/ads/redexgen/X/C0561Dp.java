package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Dp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0561Dp {
    public int A00;
    public long A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final InterfaceC0554Di A05;
    public final C0678Ii A06 = new C0678Ii(new byte[64]);
    public final C0691Iv A07;

    public C0561Dp(InterfaceC0554Di interfaceC0554Di, C0691Iv c0691Iv) {
        this.A05 = interfaceC0554Di;
        this.A07 = c0691Iv;
    }

    private void A00() {
        this.A06.A08(8);
        this.A03 = this.A06.A0F();
        this.A02 = this.A06.A0F();
        this.A06.A08(6);
        this.A00 = this.A06.A04(8);
    }

    private void A01() {
        this.A01 = 0L;
        if (this.A03) {
            this.A06.A08(4);
            long jA04 = ((long) this.A06.A04(3)) << 30;
            this.A06.A08(1);
            long jA05 = jA04 | ((long) (this.A06.A04(15) << 15));
            this.A06.A08(1);
            long jA06 = jA05 | ((long) this.A06.A04(15));
            this.A06.A08(1);
            if (!this.A04 && this.A02) {
                this.A06.A08(4);
                long jA07 = ((long) this.A06.A04(3)) << 30;
                this.A06.A08(1);
                long jA08 = jA07 | ((long) (this.A06.A04(15) << 15));
                this.A06.A08(1);
                long jA09 = jA08 | ((long) this.A06.A04(15));
                this.A06.A08(1);
                this.A07.A07(jA09);
                this.A04 = true;
            }
            long pts = this.A07.A07(jA06);
            this.A01 = pts;
        }
    }

    public final void A02() {
        this.A04 = false;
        this.A05.AEK();
    }

    public final void A03(C0679Ij c0679Ij) throws C0488Af {
        c0679Ij.A0c(this.A06.A00, 0, 3);
        this.A06.A07(0);
        A00();
        c0679Ij.A0c(this.A06.A00, 0, this.A00);
        this.A06.A07(0);
        A01();
        this.A05.AD4(this.A01, true);
        this.A05.A48(c0679Ij);
        this.A05.AD3();
    }
}
