package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zu4 extends cx1 implements x81<String, List<? extends String>, sd5> {
    public final /* synthetic */ av4 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zu4(av4 av4Var) {
        super(2);
        this.w = av4Var;
    }

    @Override // defpackage.x81
    public final sd5 invoke(String str, List<? extends String> list) {
        this.w.c(str, list);
        return sd5.a;
    }
}
