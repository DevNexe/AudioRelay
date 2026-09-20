package defpackage;

import android.os.Bundle;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Vb5 {
    public final String a;
    public final int b;
    public final List<String> c;
    public final Bundle d;

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;Ljava/lang/Object;Ljava/util/List<Ljava/lang/String;>;Landroid/os/Bundle;)V */
    public Vb5(String str, int i, List list, Bundle bundle) {
        this.a = str;
        this.b = i;
        this.c = list;
        this.d = bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Vb5)) {
            return false;
        }
        Vb5 vb5 = (Vb5) obj;
        return ur1.a(this.a, vb5.a) && this.b == vb5.b && ur1.a(this.c, vb5.c) && ur1.a(this.d, vb5.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + qg5.a(this.c, (O.h(this.b) + (this.a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "AdUnitConfig(adUnitId=" + this.a + ", provider=" + Ya.b(this.b) + ", keywords=" + this.c + ", adMobExtras=" + this.d + ")";
    }
}
