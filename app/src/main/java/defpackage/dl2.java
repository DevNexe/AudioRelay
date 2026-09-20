package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class dl2 {
    public static final /* synthetic */ int E = 0;
    public final wq4<hk2> A;
    public final LinkedHashMap B;
    public int C;
    public String D;
    public final String w;
    public fl2 x;
    public CharSequence y;
    public final ArrayList z;

    public static final class CQf implements Comparable<CQf> {
        public final int A;
        public final dl2 w;
        public final Bundle x;
        public final boolean y;
        public final boolean z;

        public CQf(dl2 dl2Var, Bundle bundle, boolean z, boolean z2, int i) {
            this.w = dl2Var;
            this.x = bundle;
            this.y = z;
            this.z = z2;
            this.A = i;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final int compareTo(CQf cQf) {
            boolean z = cQf.y;
            boolean z2 = this.y;
            if (z2 && !z) {
                return 1;
            }
            if (!z2 && z) {
                return -1;
            }
            Bundle bundle = cQf.x;
            Bundle bundle2 = this.x;
            if (bundle2 != null && bundle == null) {
                return 1;
            }
            if (bundle2 == null && bundle != null) {
                return -1;
            }
            if (bundle2 != null) {
                int size = bundle2.size() - bundle.size();
                if (size > 0) {
                    return 1;
                }
                if (size < 0) {
                    return -1;
                }
            }
            boolean z3 = cQf.z;
            boolean z4 = this.z;
            if (z4 && !z3) {
                return 1;
            }
            if (z4 || !z3) {
                return this.A - cQf.A;
            }
            return -1;
        }
    }

    public static final class QnHx {
        public static String a(String str) {
            return str != null ? "android-app://androidx.navigation/".concat(str) : "";
        }

        public static String b(Context context, int i) {
            if (i <= 16777215) {
                return String.valueOf(i);
            }
            try {
                return context.getResources().getResourceName(i);
            } catch (Resources.NotFoundException unused) {
                return String.valueOf(i);
            }
        }
    }

    static {
        new LinkedHashMap();
    }

    public dl2(zl2<? extends dl2> zl2Var) {
        LinkedHashMap linkedHashMap = cm2.b;
        this.w = cm2.QnHx.a(zl2Var.getClass());
        this.z = new ArrayList();
        this.A = new wq4<>();
        this.B = new LinkedHashMap();
    }

    public final void a(yk2 yk2Var) {
        Map<String, ik2> mapC = c();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<String, ik2>> it = mapC.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, ik2> next = it.next();
            ik2 value = next.getValue();
            if ((value.b || value.c) ? false : true) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        Set setKeySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            String str = (String) obj;
            ArrayList arrayList2 = yk2Var.d;
            Collection collectionValues = yk2Var.e.values();
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = collectionValues.iterator();
            while (it2.hasNext()) {
                su.x0(((yk2.CQf) it2.next()).b, arrayList3);
            }
            if (!wu.U0(arrayList3, arrayList2).contains(str)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            this.z.add(yk2Var);
            return;
        }
        throw new IllegalArgumentException(("Deep link " + yk2Var.a + " can't be used to open destination " + this + ".\nFollowing required arguments are missing: " + arrayList).toString());
    }

    public final Bundle b(Bundle bundle) {
        boolean z;
        LinkedHashMap linkedHashMap = this.B;
        if (bundle == null) {
            if (linkedHashMap == null || linkedHashMap.isEmpty()) {
                return null;
            }
        }
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            ik2 ik2Var = (ik2) entry.getValue();
            if (ik2Var.c) {
                ik2Var.a.d(bundle2, str, ik2Var.d);
            }
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String str2 = (String) entry2.getKey();
                ik2 ik2Var2 = (ik2) entry2.getValue();
                boolean z2 = ik2Var2.b;
                vl2<Object> vl2Var = ik2Var2.a;
                if (!z2 && bundle2.containsKey(str2) && bundle2.get(str2) == null) {
                    z = false;
                } else {
                    try {
                        vl2Var.a(bundle2, str2);
                        z = true;
                    } catch (ClassCastException unused) {
                        z = false;
                    }
                }
                if (!z) {
                    StringBuilder sbA = N.a("Wrong argument type for '", str2, "' in argument bundle. ");
                    sbA.append(vl2Var.b());
                    sbA.append(" expected.");
                    throw new IllegalArgumentException(sbA.toString().toString());
                }
            }
        }
        return bundle2;
    }

    public final Map<String, ik2> c() {
        return t92.W(this.B);
    }

    /* JADX WARN: Code duplicated, block: B:78:0x0172  */
    /* JADX WARN: Code duplicated, block: B:85:0x0190  */
    public CQf e(al2 al2Var) {
        Bundle bundle;
        int i;
        int i2;
        List listSingletonList;
        int i3;
        List listA1;
        List listSingletonList2;
        int i4;
        Bundle bundle2;
        ik2 value;
        boolean z;
        Matcher matcher;
        LinkedHashMap linkedHashMap;
        Uri uri;
        Iterator it;
        String strGroup;
        ArrayList<yk2> arrayList = this.z;
        Matcher matcher2 = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        CQf cQf = null;
        for (yk2 yk2Var : arrayList) {
            Uri uri2 = al2Var.a;
            if (uri2 != null) {
                Map<String, ik2> mapC = c();
                Pattern pattern = (Pattern) yk2Var.g.getValue();
                Matcher matcher3 = pattern != null ? pattern.matcher(uri2.toString()) : matcher2;
                if (matcher3 == null || !matcher3.matches()) {
                    bundle2 = null;
                    break;
                }
                bundle2 = new Bundle();
                ArrayList arrayList2 = yk2Var.d;
                int size = arrayList2.size();
                int i5 = 0;
                while (i5 < size) {
                    String str = (String) arrayList2.get(i5);
                    i5++;
                    String strDecode = Uri.decode(matcher3.group(i5));
                    ik2 ik2Var = mapC.get(str);
                    if (ik2Var != null) {
                        try {
                            vl2<Object> vl2Var = ik2Var.a;
                            vl2Var.d(bundle2, str, vl2Var.c(strDecode));
                        } catch (IllegalArgumentException unused) {
                        }
                    } else {
                        bundle2.putString(str, strDecode);
                    }
                }
                if (yk2Var.h) {
                    LinkedHashMap linkedHashMap2 = yk2Var.e;
                    Iterator it2 = linkedHashMap2.keySet().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            String str2 = (String) it2.next();
                            yk2.CQf cQf2 = (yk2.CQf) linkedHashMap2.get(str2);
                            String queryParameter = uri2.getQueryParameter(str2);
                            if (yk2Var.i) {
                                String string = uri2.toString();
                                String strT = mv4.T(string, '?');
                                if (!ur1.a(strT, string)) {
                                    queryParameter = strT;
                                }
                            }
                            if (queryParameter != null) {
                                matcher = Pattern.compile(cQf2.a, 32).matcher(queryParameter);
                                if (!matcher.matches()) {
                                }
                            } else {
                                matcher = null;
                            }
                            Bundle bundle3 = new Bundle();
                            ArrayList arrayList3 = cQf2.b;
                            try {
                                int size2 = arrayList3.size();
                                int i6 = 0;
                                while (i6 < size2) {
                                    if (matcher != null) {
                                        try {
                                            strGroup = matcher.group(i6 + 1);
                                            if (strGroup == null) {
                                                strGroup = "";
                                            }
                                        } catch (IllegalArgumentException unused2) {
                                            linkedHashMap = linkedHashMap2;
                                            uri = uri2;
                                            it = it2;
                                        }
                                    } else {
                                        strGroup = null;
                                    }
                                    linkedHashMap = linkedHashMap2;
                                    try {
                                        String str3 = (String) arrayList3.get(i6);
                                        uri = uri2;
                                        try {
                                            ik2 ik2Var2 = mapC.get(str3);
                                            if (strGroup != null) {
                                                it = it2;
                                                try {
                                                    if (!ur1.a(strGroup, '{' + str3 + '}')) {
                                                        if (ik2Var2 != null) {
                                                            vl2<Object> vl2Var2 = ik2Var2.a;
                                                            vl2Var2.d(bundle3, str3, vl2Var2.c(strGroup));
                                                        } else {
                                                            bundle3.putString(str3, strGroup);
                                                        }
                                                    }
                                                } catch (IllegalArgumentException unused3) {
                                                    it2 = it;
                                                    linkedHashMap2 = linkedHashMap;
                                                    uri2 = uri;
                                                }
                                            } else {
                                                it = it2;
                                            }
                                            i6++;
                                            it2 = it;
                                            linkedHashMap2 = linkedHashMap;
                                            uri2 = uri;
                                        } catch (IllegalArgumentException unused4) {
                                            it = it2;
                                            it2 = it;
                                            linkedHashMap2 = linkedHashMap;
                                            uri2 = uri;
                                        }
                                    } catch (IllegalArgumentException unused5) {
                                        uri = uri2;
                                        it = it2;
                                        it2 = it;
                                        linkedHashMap2 = linkedHashMap;
                                        uri2 = uri;
                                    }
                                }
                                linkedHashMap = linkedHashMap2;
                                uri = uri2;
                                it = it2;
                                bundle2.putAll(bundle3);
                            } catch (IllegalArgumentException unused6) {
                                linkedHashMap = linkedHashMap2;
                            }
                            it2 = it;
                            linkedHashMap2 = linkedHashMap;
                            uri2 = uri;
                        } else {
                            for (Map.Entry<String, ik2> entry : mapC.entrySet()) {
                                String key = entry.getKey();
                                value = entry.getValue();
                                if (value != null || value.b || value.c) {
                                    z = false;
                                } else {
                                    z = true;
                                }
                                if (z || bundle2.containsKey(key)) {
                                }
                            }
                        }
                        bundle2 = null;
                        break;
                    }
                }
                while (r1.hasNext()) {
                    String key2 = entry.getKey();
                    value = entry.getValue();
                    if (value != null) {
                        z = false;
                    } else {
                        z = false;
                    }
                    if (z) {
                    }
                }
                bundle = bundle2;
            } else {
                bundle = null;
            }
            String str4 = al2Var.b;
            boolean z2 = str4 != null && ur1.a(str4, yk2Var.b);
            String str5 = al2Var.c;
            if (str5 != null) {
                String str6 = yk2Var.c;
                if (str6 == null || !((Pattern) yk2Var.k.getValue()).matcher(str5).matches()) {
                    i2 = -1;
                } else {
                    Pattern patternCompile = Pattern.compile("/");
                    mv4.N(0);
                    Matcher matcher4 = patternCompile.matcher(str6);
                    if (matcher4.find()) {
                        ArrayList arrayList4 = new ArrayList(10);
                        int iEnd = 0;
                        do {
                            arrayList4.add(str6.subSequence(iEnd, matcher4.start()).toString());
                            iEnd = matcher4.end();
                        } while (matcher4.find());
                        arrayList4.add(str6.subSequence(iEnd, str6.length()).toString());
                        listSingletonList = arrayList4;
                    } else {
                        listSingletonList = Collections.singletonList(str6.toString());
                    }
                    boolean zIsEmpty = listSingletonList.isEmpty();
                    List listA2 = cs0.w;
                    if (zIsEmpty) {
                        i3 = 1;
                        listA1 = listA2;
                        break;
                    }
                    ListIterator listIterator = listSingletonList.listIterator(listSingletonList.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            i3 = 1;
                            listA1 = listA2;
                            break;
                        }
                        if (!(((String) listIterator.previous()).length() == 0)) {
                            i3 = 1;
                            listA1 = wu.a1(listSingletonList, listIterator.nextIndex() + 1);
                            break;
                        }
                    }
                    String str7 = (String) listA1.get(0);
                    String str8 = (String) listA1.get(i3);
                    Pattern patternCompile2 = Pattern.compile("/");
                    mv4.N(0);
                    Matcher matcher5 = patternCompile2.matcher(str5);
                    if (matcher5.find()) {
                        ArrayList arrayList5 = new ArrayList(10);
                        int iEnd2 = 0;
                        do {
                            arrayList5.add(str5.subSequence(iEnd2, matcher5.start()).toString());
                            iEnd2 = matcher5.end();
                        } while (matcher5.find());
                        arrayList5.add(str5.subSequence(iEnd2, str5.length()).toString());
                        listSingletonList2 = arrayList5;
                    } else {
                        listSingletonList2 = Collections.singletonList(str5.toString());
                    }
                    if (listSingletonList2.isEmpty()) {
                        i4 = 1;
                        break;
                    }
                    ListIterator listIterator2 = listSingletonList2.listIterator(listSingletonList2.size());
                    while (true) {
                        if (!listIterator2.hasPrevious()) {
                            i4 = 1;
                            break;
                        }
                        if (!(((String) listIterator2.previous()).length() == 0)) {
                            i4 = 1;
                            listA2 = wu.a1(listSingletonList2, listIterator2.nextIndex() + 1);
                            break;
                        }
                    }
                    String str9 = (String) listA2.get(0);
                    String str10 = (String) listA2.get(i4);
                    i2 = ur1.a(str7, str9) ? 2 : 0;
                    if (ur1.a(str8, str10)) {
                        i2++;
                    }
                }
                i = i2;
            } else {
                i = -1;
            }
            if (bundle != null || z2 || i > -1) {
                CQf cQf3 = new CQf(this, bundle, yk2Var.l, z2, i);
                if (cQf == null || cQf3.compareTo(cQf) > 0) {
                    cQf = cQf3;
                }
            }
            matcher2 = null;
        }
        return cQf;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:86:0x015a  */
    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        if (obj == null || !(obj instanceof dl2)) {
            return false;
        }
        ArrayList arrayList = this.z;
        dl2 dl2Var = (dl2) obj;
        ArrayList arrayList2 = dl2Var.z;
        Set setG1 = wu.g1(arrayList);
        sb5.a(setG1).retainAll(ddf.g(arrayList2, setG1));
        boolean z7 = setG1.size() == arrayList.size();
        wq4<hk2> wq4Var = this.A;
        int iK = wq4Var.k();
        wq4<hk2> wq4Var2 = dl2Var.A;
        if (iK == wq4Var2.k()) {
            Iterator it = ba4.F0(new xq4(wq4Var)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    z5 = true;
                    break;
                }
                hk2 hk2Var = (hk2) it.next();
                if (wq4Var2.w) {
                    wq4Var2.h();
                }
                int i = 0;
                while (true) {
                    if (i >= wq4Var2.z) {
                        i = -1;
                        break;
                    }
                    if (wq4Var2.y[i] == hk2Var) {
                        break;
                    }
                    i++;
                }
                if (!(i >= 0)) {
                    z5 = false;
                    break;
                }
            }
            if (z5) {
                Iterator it2 = ba4.F0(new xq4(wq4Var2)).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z6 = true;
                        break;
                    }
                    hk2 hk2Var2 = (hk2) it2.next();
                    if (wq4Var.w) {
                        wq4Var.h();
                    }
                    int i2 = 0;
                    while (true) {
                        if (i2 >= wq4Var.z) {
                            i2 = -1;
                            break;
                        }
                        if (wq4Var.y[i2] == hk2Var2) {
                            break;
                        }
                        i2++;
                    }
                    if (!(i2 >= 0)) {
                        z6 = false;
                        break;
                    }
                }
                if (z6) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (c().size() == dl2Var.c().size()) {
            Iterator<T> it3 = c().entrySet().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    z3 = true;
                    break;
                }
                Map.Entry entry = (Map.Entry) it3.next();
                if (!(dl2Var.c().containsKey(entry.getKey()) && ur1.a(dl2Var.c().get(entry.getKey()), entry.getValue()))) {
                    z3 = false;
                    break;
                }
            }
            if (z3) {
                Iterator<T> it4 = dl2Var.c().entrySet().iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        z4 = true;
                        break;
                    }
                    Map.Entry entry2 = (Map.Entry) it4.next();
                    if (!(c().containsKey(entry2.getKey()) && ur1.a(c().get(entry2.getKey()), entry2.getValue()))) {
                        z4 = false;
                        break;
                    }
                }
                if (z4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        return this.C == dl2Var.C && ur1.a(this.D, dl2Var.D) && z7 && z && z2;
    }

    public final void f(String str) {
        Object obj = null;
        if (str == null) {
            this.C = 0;
        } else {
            if (!(!iv4.s(str))) {
                throw new IllegalArgumentException("Cannot have an empty route".toString());
            }
            String strA = QnHx.a(str);
            this.C = strA.hashCode();
            a(new yk2(strA, null, null));
        }
        ArrayList arrayList = this.z;
        for (Object obj2 : arrayList) {
            if (ur1.a(((yk2) obj2).a, QnHx.a(this.D))) {
                obj = obj2;
                break;
            }
        }
        sb5.a(arrayList).remove(obj);
        this.D = str;
    }

    public int hashCode() {
        int i = this.C * 31;
        String str = this.D;
        int iHashCode = i + (str != null ? str.hashCode() : 0);
        for (yk2 yk2Var : this.z) {
            int i2 = iHashCode * 31;
            String str2 = yk2Var.a;
            int iHashCode2 = (i2 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = yk2Var.b;
            int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = yk2Var.c;
            iHashCode = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }
        int i3 = 0;
        while (true) {
            wq4<hk2> wq4Var = this.A;
            if (!(i3 < wq4Var.k())) {
                break;
            }
            wq4Var.l(i3).getClass();
            iHashCode = (((iHashCode * 31) + 0) * 31) + 0;
            i3++;
        }
        for (String str5 : c().keySet()) {
            int iA = bl2.a(str5, iHashCode * 31, 31);
            ik2 ik2Var = c().get(str5);
            iHashCode = iA + (ik2Var != null ? ik2Var.hashCode() : 0);
        }
        return iHashCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        sb.append("0x");
        sb.append(Integer.toHexString(this.C));
        sb.append(")");
        String str = this.D;
        if (!(str == null || iv4.s(str))) {
            sb.append(" route=");
            sb.append(this.D);
        }
        if (this.y != null) {
            sb.append(" label=");
            sb.append(this.y);
        }
        return sb.toString();
    }
}
