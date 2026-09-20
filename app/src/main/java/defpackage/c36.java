package defpackage;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final class c36 implements Comparator {
    public final /* synthetic */ uw5 w;
    public final /* synthetic */ ma5 x;

    public c36(uw5 uw5Var, ma5 ma5Var) {
        this.w = uw5Var;
        this.x = ma5Var;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        ez5 ez5Var = (ez5) obj;
        ez5 ez5Var2 = (ez5) obj2;
        if (ez5Var instanceof n06) {
            return !(ez5Var2 instanceof n06) ? 1 : 0;
        }
        if (ez5Var2 instanceof n06) {
            return -1;
        }
        uw5 uw5Var = this.w;
        return uw5Var == null ? ez5Var.zzi().compareTo(ez5Var2.zzi()) : (int) nw6.a(uw5Var.d(this.x, Arrays.asList(ez5Var, ez5Var2)).zzh().doubleValue());
    }
}
