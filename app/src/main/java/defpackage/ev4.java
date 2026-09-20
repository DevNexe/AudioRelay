package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class ev4 extends ddf {
    public static final String l(String str) {
        int length;
        Comparable comparable;
        List<String> listJ = mv4.J(str);
        List<String> list = listJ;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!iv4.s((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(mu.w0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            length = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            int length2 = str2.length();
            while (true) {
                if (length >= length2) {
                    length = -1;
                    break;
                }
                if (!Th.n(str2.charAt(length))) {
                    break;
                }
                length++;
            }
            if (length == -1) {
                length = str2.length();
            }
            arrayList2.add(Integer.valueOf(length));
        }
        Iterator it2 = arrayList2.iterator();
        if (it2.hasNext()) {
            comparable = (Comparable) it2.next();
            while (it2.hasNext()) {
                Comparable comparable2 = (Comparable) it2.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        } else {
            comparable = null;
        }
        Integer num = (Integer) comparable;
        int iIntValue = num != null ? num.intValue() : 0;
        int size = (listJ.size() * 0) + str.length();
        int iJ = ps0.J(listJ);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list) {
            int i = length + 1;
            if (length < 0) {
                ps0.j0();
                throw null;
            }
            String str3 = (String) obj2;
            if ((length == 0 || length == iJ) && iv4.s(str3)) {
                str3 = null;
            } else {
                String strInvoke = dv4.w.invoke(pv4.Y(iIntValue, str3));
                if (strInvoke != null) {
                    str3 = strInvoke;
                }
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            length = i;
        }
        StringBuilder sb = new StringBuilder(size);
        wu.L0(arrayList3, sb, "\n", null, 124);
        return sb.toString();
    }

    public static String m(String str) {
        if (!(!iv4.s("|"))) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
        }
        List<String> listJ = mv4.J(str);
        int size = (listJ.size() * 0) + str.length();
        int iJ = ps0.J(listJ);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listJ.iterator();
        int i = 0;
        while (true) {
            String strInvoke = null;
            if (!it.hasNext()) {
                StringBuilder sb = new StringBuilder(size);
                wu.L0(arrayList, sb, "\n", null, 124);
                return sb.toString();
            }
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                ps0.j0();
                throw null;
            }
            String str2 = (String) next;
            if ((i != 0 && i != iJ) || !iv4.s(str2)) {
                int length = str2.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        i3 = -1;
                        break;
                    }
                    if (!Th.n(str2.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
                if (i3 != -1 && iv4.w(str2, i3, "|", false)) {
                    strInvoke = str2.substring("|".length() + i3);
                }
                if (strInvoke == null || (strInvoke = dv4.w.invoke(strInvoke)) == null) {
                    strInvoke = str2;
                }
            }
            if (strInvoke != null) {
                arrayList.add(strInvoke);
            }
            i = i2;
        }
    }
}
