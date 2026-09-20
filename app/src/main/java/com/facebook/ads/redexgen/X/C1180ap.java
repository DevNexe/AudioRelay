package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ap, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1180ap implements InterfaceC04136v {
    public static String[] A01 = {"Yjf", "XOVitfQUgjced3EP4pTxR9JfCPrZNimg", "oba6yDpI8JhOkZT1tW78u2uvc0qfjLnV", "P0DudR6QiRsnBUUKuogjXBQdTc93lhW3", "bGr8mOattKCTE", "1b5SBqQWJyWOe", "v908sogRF2eWxcHJkGHFI", "Zt6OKsa3VoJXRparXiRDL2uvOYm8XqDs"};
    public final /* synthetic */ C1163aY A00;

    public C1180ap(C1163aY c1163aY) {
        this.A00 = c1163aY;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04136v
    public final C7A A5J() throws Exception {
        String strA06 = this.A00.A03.A06(10003);
        if (strA06 != null) {
            C1163aY c1163aY = this.A00;
            if (A01[0].length() != 3) {
                throw new RuntimeException();
            }
            A01[1] = "utTbKSFu34D38IEG5HgAcdNNoC6CJDRH";
            return c1163aY.A08(strA06);
        }
        return this.A00.A07(AnonymousClass76.A07);
    }
}
