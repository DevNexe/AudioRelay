package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class FM extends AbstractC0960Tk<C1306cw> {
    public static String[] A00 = {"ByMq6MLqhjUJsdWB3RBIp", "zuOr3", "msyHKBX3wHVeYE5obxbctQprcgEzI02t", "I3sOgeRwcNYGF4oixOV5Q17", "dcB", "ibtCqc8qysdz0E5AMIDmPhuL1XZA", "mNtKCg4kzaH6sXUtb2oDuqx2", "ObFvkEusatMYzjWaq72f4FkWXHrQjerH"};

    public FM(C1306cw c1306cw) {
        super(c1306cw);
    }

    @Override // com.facebook.ads.redexgen.X.L8
    public final void A06() {
        C1306cw c1306cwA07 = A07();
        if (c1306cwA07 == null) {
            return;
        }
        C1075Xy c1075Xy = c1306cwA07.A08;
        String[] strArr = A00;
        if (strArr[3].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        A00[5] = "SiVLKh";
        if (C0778Mj.A02(c1075Xy)) {
            c1306cwA07.A07();
        } else {
            c1306cwA07.A05.postDelayed(c1306cwA07.A0C, 5000L);
        }
    }
}
