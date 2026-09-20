package defpackage;

import com.azefsw.audioconnect.R;

/* JADX INFO: loaded from: classes.dex */
public final class mh4 extends cx1 implements j81<lKy3, sd5> {
    public final /* synthetic */ oh4 w;
    public final /* synthetic */ tg4.LPt6Fixed x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mh4(oh4 oh4Var, tg4.LPt6Fixed lPt6) {
        super(1);
        this.w = oh4Var;
        this.x = lPt6;
    }

    @Override // defpackage.j81
    public final sd5 invoke(lKy3 lky3) {
        lKy3 lky4 = this.w.b;
        lky4.g(lky4.d(R.string.pref_analytics_key), this.x.a);
        return sd5.a;
    }
}
