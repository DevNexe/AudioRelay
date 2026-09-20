package defpackage;

import com.google.android.gms.ads.LoadAdError;

/* JADX INFO: loaded from: classes.dex */
public final class Sr6 extends cx1 implements j81<n52, sd5> {
    public final /* synthetic */ LoadAdError w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Sr6(LoadAdError loadAdError) {
        super(1);
        this.w = loadAdError;
    }

    @Override // defpackage.j81
    public final sd5 invoke(n52 n52Var) {
        n52Var.b("label", "error_code_" + this.w.getCode());
        return sd5.a;
    }
}
