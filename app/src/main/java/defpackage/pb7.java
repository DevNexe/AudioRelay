package defpackage;

import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class pb7 extends uw5 {
    public final Callable y;

    public pb7(p87 p87Var) {
        super("internal.appMetadata");
        this.y = p87Var;
    }

    @Override // defpackage.uw5
    public final ez5 d(ma5 ma5Var, List list) {
        try {
            return wx6.b(this.y.call());
        } catch (Exception unused) {
            return ez5.o;
        }
    }
}
