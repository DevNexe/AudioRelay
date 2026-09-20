package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Rs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0917Rs implements RL {
    public static String[] A01 = {"uB1RC", "E7rLPB8klTW5J9FjuULp7NzB4AWE19Zm", "BGfRoGqubHgomR1aknLAm7BQoVqY9Rjo", "2aqRDajB7mkFiu8JUeuEjEkcXKsGj4gd", "YPIu8FWl8tmTV", "O2dNNTCX3dr0fdBVB7HhwqWACslxe6aK", "WKmspm9NaQlidgYEldSczPSkp8W1cJlS", "CDbKVWoo3Luj5aOlcVCk0HC1kDrFWNgV"};
    public final /* synthetic */ C0864Pr A00;

    public C0917Rs(C0864Pr c0864Pr) {
        this.A00 = c0864Pr;
    }

    @Override // com.facebook.ads.redexgen.X.RL
    public final void ADM() {
        if (this.A00.A02 != null) {
            C0864Pr c0864Pr = this.A00;
            if (A01[3].charAt(8) == 'm') {
                throw new RuntimeException();
            }
            A01[3] = "G62o5XZ8JRlbj2NUyH9KkdSeUCUXeXTA";
            c0864Pr.A02.A3s(this.A00.A03.A7R());
        }
    }

    @Override // com.facebook.ads.redexgen.X.RL
    public final void ADO(RN rn) {
        if (this.A00.A02 == null) {
            return;
        }
        if (rn != null && rn.A00()) {
            InterfaceC0785Mq interfaceC0785Mq = this.A00.A02;
            C0864Pr c0864Pr = this.A00;
            if (A01[5].length() == 14) {
                throw new RuntimeException();
            }
            A01[1] = "MYgqySdSEunU6EGhIZ8lv2VKjJmAUpiH";
            interfaceC0785Mq.A3s(c0864Pr.A03.A7S());
            return;
        }
        this.A00.A02.A3s(this.A00.A03.A7R());
    }
}
