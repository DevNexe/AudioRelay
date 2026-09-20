package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class p350 extends ku {
    public final /* synthetic */ int b;
    public final VOb c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p350(rv1 rv1Var, int i) {
        super(rv1Var);
        this.b = i;
        if (i != 1) {
            this.c = new VOb(rv1Var.a(), 0);
        } else {
            super(rv1Var);
            this.c = new VOb(rv1Var.a(), 1);
        }
    }

    @Override // defpackage.hu, defpackage.rv1, defpackage.db4, defpackage.zj0
    public final pa4 a() {
        return this.c;
    }

    @Override // defpackage.T23
    public final Object f() {
        switch (this.b) {
            case 0:
                return new ArrayList();
            default:
                return new LinkedHashSet();
        }
    }

    @Override // defpackage.T23
    public final int g(Object obj) {
        switch (this.b) {
            case 0:
                return ((ArrayList) obj).size();
            default:
                return ((LinkedHashSet) obj).size();
        }
    }

    @Override // defpackage.T23
    public final Object l(Object obj) {
        switch (this.b) {
            case 0:
                return new ArrayList((Collection) null);
            default:
                return new LinkedHashSet((Collection) null);
        }
    }

    @Override // defpackage.T23
    public final Object m(Object obj) {
        switch (this.b) {
            case 0:
                return (ArrayList) obj;
            default:
                return (LinkedHashSet) obj;
        }
    }

    @Override // defpackage.hu
    public final void n(int i, Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((ArrayList) obj).add(i, obj2);
                break;
            default:
                ((LinkedHashSet) obj).add(obj2);
                break;
        }
    }
}
