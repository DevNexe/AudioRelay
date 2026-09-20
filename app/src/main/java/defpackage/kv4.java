package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class kv4 extends cx1 implements x81<CharSequence, Integer, uy2<? extends Integer, ? extends Integer>> {
    public final /* synthetic */ List<String> w;
    public final /* synthetic */ boolean x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kv4(boolean z, List list) {
        super(2);
        this.w = list;
        this.x = z;
    }

    /* JADX WARN: Code duplicated, block: B:66:0x010c A[EDGE_INSN: B:66:0x010c->B:67:0x010d BREAK  A[LOOP:0: B:38:0x0096->B:49:0x00cc]] */
    @Override // defpackage.x81
    public final uy2<? extends Integer, ? extends Integer> invoke(CharSequence charSequence, Integer num) {
        Object next;
        uy2 uy2Var;
        String str;
        Object next2;
        String str2;
        Object obj;
        CharSequence charSequence2 = charSequence;
        int iIntValue = num.intValue();
        List<String> list = this.w;
        boolean z = this.x;
        if (z || list.size() != 1) {
            if (iIntValue < 0) {
                iIntValue = 0;
            }
            pp1 pp1Var = new pp1(iIntValue, charSequence2.length());
            boolean z2 = charSequence2 instanceof String;
            int i = pp1Var.y;
            int i2 = pp1Var.x;
            if (!z2) {
                if ((i > 0 && iIntValue <= i2) || (i < 0 && i2 <= iIntValue)) {
                    while (true) {
                        Iterator<T> it = list.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            str = (String) next;
                        } while (!mv4.M(str, 0, charSequence2, iIntValue, str.length(), z));
                        String str3 = (String) next;
                        if (str3 == null) {
                            if (iIntValue == i2) {
                                uy2Var = null;
                                break;
                            }
                            iIntValue += i;
                        } else {
                            uy2Var = new uy2(Integer.valueOf(iIntValue), str3);
                            break;
                        }
                    }
                } else {
                    uy2Var = null;
                    break;
                }
            } else if ((i > 0 && iIntValue <= i2) || (i < 0 && i2 <= iIntValue)) {
                while (true) {
                    Iterator<T> it2 = list.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it2.next();
                        str2 = (String) next2;
                    } while (!iv4.t(0, iIntValue, str2.length(), str2, (String) charSequence2, z));
                    String str4 = (String) next2;
                    if (str4 == null) {
                        if (iIntValue == i2) {
                            uy2Var = null;
                            break;
                        }
                        iIntValue += i;
                    } else {
                        uy2Var = new uy2(Integer.valueOf(iIntValue), str4);
                        break;
                    }
                }
            } else {
                uy2Var = null;
                break;
            }
        } else {
            List<String> list2 = list;
            if (list2 instanceof List) {
                List<String> list3 = list2;
                int size = list3.size();
                if (size == 0) {
                    throw new NoSuchElementException("List is empty.");
                }
                if (size != 1) {
                    throw new IllegalArgumentException("List has more than one element.");
                }
                obj = list3.get(0);
            } else {
                Iterator<T> it3 = list2.iterator();
                if (!it3.hasNext()) {
                    throw new NoSuchElementException("Collection is empty.");
                }
                Object next3 = it3.next();
                if (it3.hasNext()) {
                    throw new IllegalArgumentException("Collection has more than one element.");
                }
                obj = next3;
            }
            String str5 = (String) obj;
            int iF = mv4.F(charSequence2, str5, iIntValue, false, 4);
            if (iF < 0) {
                uy2Var = null;
                break;
            }
            uy2Var = new uy2(Integer.valueOf(iF), str5);
        }
        if (uy2Var == null) {
            return null;
        }
        return new uy2<>(uy2Var.w, Integer.valueOf(((String) uy2Var.x).length()));
    }
}
