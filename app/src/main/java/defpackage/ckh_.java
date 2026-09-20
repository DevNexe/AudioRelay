package defpackage;

import com.azefsw.audioconnect.R;

/* JADX INFO: loaded from: classes.dex */
public final class ckh_ extends cx1 implements j81<lKy3, sd5> {
    public final /* synthetic */ f0 w;
    public final /* synthetic */ wXc.CQf x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ckh_(f0 f0Var, wXc.CQf cQf) {
        super(1);
        this.w = f0Var;
        this.x = cQf;
    }

    @Override // defpackage.j81
    public final sd5 invoke(lKy3 lky3) {
        lKy3 lky4 = this.w.c;
        lky4.g(lky4.d(R.string.pref_enable_compression_key), this.x.a == bLBI.Compressed);
        return sd5.a;
    }
}
