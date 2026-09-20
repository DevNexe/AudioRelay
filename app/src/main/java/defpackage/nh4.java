package defpackage;

import com.azefsw.audioconnect.R;

/* JADX INFO: loaded from: classes.dex */
public final class nh4 extends cx1 implements j81<lKy3, sd5> {
    public final /* synthetic */ oh4 w;
    public final /* synthetic */ tg4.Xn1 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nh4(oh4 oh4Var, tg4.Xn1 xn1) {
        super(1);
        this.w = oh4Var;
        this.x = xn1;
    }

    @Override // defpackage.j81
    public final sd5 invoke(lKy3 lky3) {
        lKy3 lky4 = this.w.b;
        lky4.h((this.x.a ? dk4.Yes : dk4.No).w, lky4.d(R.string.pref_show_usb_card_serialization_key));
        return sd5.a;
    }
}
