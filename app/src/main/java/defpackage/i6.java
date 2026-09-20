package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class i6 {
    public final String a;
    public final String b;
    public final List<j8> c;
    public final s42 d;
    public final s42 e;

    public i6(String str, String str2, List<j8> list, s42 s42Var, s42 s42Var2) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = s42Var;
        this.e = s42Var2;
    }

    public static i6 a(i6 i6Var, List list, s42 s42Var, int i) {
        String str = (i & 1) != 0 ? i6Var.a : null;
        String str2 = (i & 2) != 0 ? i6Var.b : null;
        if ((i & 4) != 0) {
            list = i6Var.c;
        }
        List list2 = list;
        s42 s42Var2 = (i & 8) != 0 ? i6Var.d : null;
        if ((i & 16) != 0) {
            s42Var = i6Var.e;
        }
        i6Var.getClass();
        return new i6(str, str2, list2, s42Var2, s42Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i6)) {
            return false;
        }
        i6 i6Var = (i6) obj;
        return ur1.a(this.a, i6Var.a) && ur1.a(this.b, i6Var.b) && ur1.a(this.c, i6Var.c) && ur1.a(this.d, i6Var.d) && ur1.a(this.e, i6Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + qg5.a(this.c, bl2.a(this.b, this.a.hashCode() * 31, 31), 31)) * 31);
    }

    public final String toString() {
        return "BallastConnectionState(connectionId=" + this.a + ", connectionBallastVersion=" + this.b + ", viewModels=" + this.c + ", firstSeen=" + this.d + ", lastSeen=" + this.e + ')';
    }
}
