package defpackage;

import android.app.Person;
import android.app.Person$Builder;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.net.Uri;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: loaded from: classes.dex */
public final class d23 {
    public final CharSequence a;
    public final IconCompat b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;

    public static class CQf {
        public CharSequence a;
        public IconCompat b;
        public String c;
        public String d;
        public boolean e;
        public boolean f;
    }

    public static class QnHx {
        public static d23 a(Person person) {
            IconCompat iconCompat;
            CQf cQf = new CQf();
            cQf.a = person.getName();
            IconCompat iconCompatB = null;
            if (person.getIcon() != null) {
                Icon icon = person.getIcon();
                PorterDuff.Mode mode = IconCompat.k;
                icon.getClass();
                int iC = IconCompat.QnHx.c(icon);
                if (iC != 2) {
                    if (iC == 4) {
                        Uri uriD = IconCompat.QnHx.d(icon);
                        uriD.getClass();
                        String string = uriD.toString();
                        string.getClass();
                        iconCompat = new IconCompat(4);
                        iconCompat.b = string;
                    } else if (iC != 6) {
                        iconCompatB = new IconCompat(-1);
                        iconCompatB.b = icon;
                    } else {
                        Uri uriD2 = IconCompat.QnHx.d(icon);
                        uriD2.getClass();
                        String string2 = uriD2.toString();
                        string2.getClass();
                        iconCompat = new IconCompat(6);
                        iconCompat.b = string2;
                    }
                    iconCompatB = iconCompat;
                } else {
                    iconCompatB = IconCompat.b(null, IconCompat.QnHx.b(icon), IconCompat.QnHx.a(icon));
                }
            }
            cQf.b = iconCompatB;
            cQf.c = person.getUri();
            cQf.d = person.getKey();
            cQf.e = person.isBot();
            cQf.f = person.isImportant();
            return new d23(cQf);
        }

        public static Person b(d23 d23Var) {
            Person$Builder name = new Person$Builder().setName(d23Var.a);
            IconCompat iconCompat = d23Var.b;
            return name.setIcon(iconCompat != null ? iconCompat.g(null) : null).setUri(d23Var.c).setKey(d23Var.d).setBot(d23Var.e).setImportant(d23Var.f).build();
        }
    }

    public d23(CQf cQf) {
        this.a = cQf.a;
        this.b = cQf.b;
        this.c = cQf.c;
        this.d = cQf.d;
        this.e = cQf.e;
        this.f = cQf.f;
    }
}
