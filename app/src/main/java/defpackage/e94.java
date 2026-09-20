package defpackage;

import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class e94 extends cx1 implements j81<o94, sd5> {
    public final /* synthetic */ String w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e94(String str) {
        super(1);
        this.w = str;
    }

    @Override // defpackage.j81
    public final sd5 invoke(o94 o94Var) {
        qv1<Object>[] qv1VarArr = l94.a;
        o94Var.a(i94.a, Collections.singletonList(this.w));
        return sd5.a;
    }
}
