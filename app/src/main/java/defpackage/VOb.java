package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class VOb extends b42 {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VOb(pa4 pa4Var, int i) {
        super(pa4Var);
        this.c = i;
        if (i != 1) {
        } else {
            super(pa4Var);
        }
    }

    @Override // defpackage.pa4
    public final String a() {
        switch (this.c) {
            case 0:
                return "kotlin.collections.ArrayList";
            default:
                return "kotlin.collections.LinkedHashSet";
        }
    }
}
