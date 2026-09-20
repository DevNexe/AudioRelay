package defpackage;

import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class pl3 implements Serializable {
    public final Pattern w;

    public pl3(String str) {
        this.w = Pattern.compile(str);
    }

    public final String toString() {
        return this.w.toString();
    }
}
