package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bl {
    public final String a;
    public final String b;
    public final y73 c;
    public final boolean d;

    public bl(String str, String str2, y73 y73Var) {
        this.a = str;
        this.b = str2;
        this.c = y73Var;
        this.d = XTd3.p(y73Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bl)) {
            return false;
        }
        bl blVar = (bl) obj;
        return ur1.a(this.a, blVar.a) && ur1.a(this.b, blVar.b) && ur1.a(this.c, blVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + bl2.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "CachedPlayerState(lastServerName=" + this.a + ", lastServerAddress=" + this.b + ", playerState=" + this.c + ")";
    }
}
