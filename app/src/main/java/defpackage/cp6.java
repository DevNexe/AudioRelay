package defpackage;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class cp6 extends AbstractMap {

    @CheckForNull
    public transient hn6 w;

    @CheckForNull
    public transient bp6 x;

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        hn6 hn6Var = this.w;
        if (hn6Var != null) {
            return hn6Var;
        }
        hn6 hn6Var2 = new hn6((jn6) this);
        this.w = hn6Var2;
        return hn6Var2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        bp6 bp6Var = this.x;
        if (bp6Var != null) {
            return bp6Var;
        }
        bp6 bp6Var2 = new bp6(this);
        this.x = bp6Var2;
        return bp6Var2;
    }
}
