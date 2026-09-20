package defpackage;

import java.io.File;
import java.nio.charset.Charset;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sy1 implements Comparator {
    public final /* synthetic */ int w;

    public /* synthetic */ sy1(int i) {
        this.w = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.w) {
            case 0:
                uy2 uy2Var = (uy2) obj;
                uy2 uy2Var2 = (uy2) obj2;
                return (((Number) uy2Var.x).intValue() - ((Number) uy2Var.w).intValue()) - (((Number) uy2Var2.x).intValue() - ((Number) uy2Var2.w).intValue());
            case 1:
                return ((bc0.F1) obj).a().compareTo(((bc0.F1) obj2).a());
            default:
                Charset charset = fc0.d;
                String name = ((File) obj).getName();
                int i = fc0.e;
                return name.substring(0, i).compareTo(((File) obj2).getName().substring(0, i));
        }
    }
}
