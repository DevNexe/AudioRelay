package defpackage;

import com.azefsw.audioconnect.R;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gm3 implements i91 {
    public final /* synthetic */ int w;
    public final /* synthetic */ ss3 x;

    public /* synthetic */ gm3(ss3 ss3Var, int i) {
        this.w = i;
        this.x = ss3Var;
    }

    @Override // defpackage.i91
    public final Object apply(Object obj) {
        dk4 dk4Var = dk4.Uninitialized;
        int i = this.w;
        ss3 ss3Var = this.x;
        switch (i) {
            case 0:
                vk4<A$Y4> vk4VarI = ((fm3) ss3Var.x).i();
                hm3 hm3Var = new hm3(ss3Var, 1);
                vk4VarI.getClass();
                return new hx(new bl4(vk4VarI, hm3Var));
            case 1:
                if (((dk4) obj) != dk4Var) {
                    return cx.w;
                }
                vk4<Boolean> vk4VarC = ((fm3) ss3Var.x).c();
                gm3 gm3Var = new gm3(ss3Var, 2);
                vk4VarC.getClass();
                return new gl4(vk4VarC, gm3Var);
            default:
                Boolean bool = (Boolean) obj;
                lKy3 lky3 = (lKy3) ss3Var.y;
                if (lky3.p() != dk4Var) {
                    return cx.w;
                }
                lky3.h((bool.booleanValue() ? dk4.Yes : dk4.No).w, lky3.d(R.string.pref_show_usb_card_serialization_key));
                return cx.w;
        }
    }
}
