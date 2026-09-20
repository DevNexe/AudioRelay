package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ad5 extends cx1 implements x81<String, List<? extends String>, sd5> {
    public final /* synthetic */ zc5 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ad5(zc5 zc5Var) {
        super(2);
        this.w = zc5Var;
    }

    @Override // defpackage.x81
    public final sd5 invoke(String str, List<? extends String> list) {
        this.w.i.c(str, list);
        return sd5.a;
    }
}
