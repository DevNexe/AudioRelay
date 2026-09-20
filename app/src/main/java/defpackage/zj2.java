package defpackage;

import com.azefsw.audioconnect.player.audio.output.jni.NativeAudioOutputException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zj2 implements InterfaceC1443fH {
    public final /* synthetic */ int a;
    public final /* synthetic */ ak2 b;

    public /* synthetic */ zj2(ak2 ak2Var, int i) {
        this.a = i;
        this.b = ak2Var;
    }

    @Override // defpackage.InterfaceC1443fH
    public final void run() {
        bk2 bk2Var = null;
        switch (this.a) {
            case 0:
                ak2 ak2Var = this.b;
                synchronized (ak2Var) {
                    if (ak2Var.z) {
                        return;
                    }
                    String[] strArrH = ak2Var.w.h(ak2Var.x.g);
                    bk2 bk2Var2 = strArrH == null ? null : new bk2(strArrH[0], strArrH[1]);
                    if (bk2Var2 != null) {
                        c2 c2Var = dk2.a;
                        dk2.a.a(new ck2(bk2Var2));
                        bk2Var = bk2Var2;
                    }
                    if (bk2Var != null) {
                        throw new NativeAudioOutputException(bk2Var.b);
                    }
                    sd5 sd5Var = sd5.a;
                    return;
                }
            default:
                String[] strArrD = this.b.w.d();
                bk2 bk2Var3 = strArrD == null ? null : new bk2(strArrD[0], strArrD[1]);
                if (bk2Var3 != null) {
                    c2 c2Var2 = dk2.a;
                    dk2.a.a(new ck2(bk2Var3));
                    bk2Var = bk2Var3;
                }
                if (bk2Var != null) {
                    throw new NativeAudioOutputException(bk2Var.b);
                }
                return;
        }
    }
}
