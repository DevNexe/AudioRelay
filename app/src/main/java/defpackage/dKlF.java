package defpackage;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class dKlF extends cx1 implements h81<l65> {
    public final /* synthetic */ lKy3 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dKlF(lKy3 lky3) {
        super(0);
        this.w = lky3;
    }

    @Override // defpackage.h81
    public final l65 invoke() {
        int i = this.w.e().getInt("THEME_PREF", 2);
        for (l65 l65Var : l65.values()) {
            if (l65Var.w == i) {
                return l65Var;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }
}
