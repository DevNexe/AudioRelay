package defpackage;

import com.google.android.gms.internal.ads.zzfvr;
import java.util.Collection;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ao6 implements zzfvr {

    @CheckForNull
    public transient mn6 w;

    @CheckForNull
    public transient zn6 x;

    @CheckForNull
    public transient jn6 y;

    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfvr) {
            return zzu().equals(((zzfvr) obj).zzu());
        }
        return false;
    }

    public final int hashCode() {
        return zzu().hashCode();
    }

    public final String toString() {
        return zzu().toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfvr
    public final Collection zzt() {
        zn6 zn6Var = this.x;
        if (zn6Var != null) {
            return zn6Var;
        }
        zn6 zn6Var2 = new zn6((xn6) this, 0);
        this.x = zn6Var2;
        return zn6Var2;
    }

    @Override // com.google.android.gms.internal.ads.zzfvr
    public final Map zzu() {
        jn6 qn6Var;
        jn6 jn6Var = this.y;
        if (jn6Var != null) {
            return jn6Var;
        }
        hp6 hp6Var = (hp6) this;
        Map map = hp6Var.z;
        if (map instanceof NavigableMap) {
            qn6Var = new nn6(hp6Var, (NavigableMap) map);
        } else {
            qn6Var = map instanceof SortedMap ? new qn6(hp6Var, (SortedMap) map) : new jn6(hp6Var, map);
        }
        this.y = qn6Var;
        return qn6Var;
    }
}
