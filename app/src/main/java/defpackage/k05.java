package defpackage;

import android.database.Cursor;
import com.google.ads.mediation.facebook.FacebookAdapter;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class k05 {
    public final String a;
    public final Map<String, QnHx> b;
    public final Set<CQf> c;
    public final Set<LPt8Fixed> d;

    public static class CQf {
        public final String a;
        public final String b;
        public final String c;
        public final List<String> d;
        public final List<String> e;

        public CQf(String str, String str2, String str3, List<String> list, List<String> list2) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = Collections.unmodifiableList(list);
            this.e = Collections.unmodifiableList(list2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || CQf.class != obj.getClass()) {
                return false;
            }
            CQf cQf = (CQf) obj;
            if (this.a.equals(cQf.a) && this.b.equals(cQf.b) && this.c.equals(cQf.c) && this.d.equals(cQf.d)) {
                return this.e.equals(cQf.e);
            }
            return false;
        }

        public final int hashCode() {
            return this.e.hashCode() + ((this.d.hashCode() + bl2.a(this.c, bl2.a(this.b, this.a.hashCode() * 31, 31), 31)) * 31);
        }

        public final String toString() {
            return "ForeignKey{referenceTable='" + this.a + "', onDelete='" + this.b + "', onUpdate='" + this.c + "', columnNames=" + this.d + ", referenceColumnNames=" + this.e + '}';
        }
    }

    public static class F1 implements Comparable<F1> {
        public final int w;
        public final int x;
        public final String y;
        public final String z;

        public F1(int i, int i2, String str, String str2) {
            this.w = i;
            this.x = i2;
            this.y = str;
            this.z = str2;
        }

        @Override // java.lang.Comparable
        public final int compareTo(F1 f1) {
            F1 f2 = f1;
            int i = this.w - f2.w;
            return i == 0 ? this.x - f2.x : i;
        }
    }

    public static class LPt8Fixed {
        public final String a;
        public final boolean b;
        public final List<String> c;

        public LPt8Fixed(List list, String str, boolean z) {
            this.a = str;
            this.b = z;
            this.c = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || LPt8Fixed.class != obj.getClass()) {
                return false;
            }
            LPt8Fixed lPt8 = (LPt8Fixed) obj;
            if (this.b != lPt8.b || !this.c.equals(lPt8.c)) {
                return false;
            }
            String str = this.a;
            boolean zStartsWith = str.startsWith("index_");
            String str2 = lPt8.a;
            return zStartsWith ? str2.startsWith("index_") : str.equals(str2);
        }

        public final int hashCode() {
            String str = this.a;
            return this.c.hashCode() + ((((str.startsWith("index_") ? -1184239155 : str.hashCode()) * 31) + (this.b ? 1 : 0)) * 31);
        }

        public final String toString() {
            return "Index{name='" + this.a + "', unique=" + this.b + ", columns=" + this.c + '}';
        }
    }

    public static class QnHx {
        public final String a;
        public final String b;
        public final int c;
        public final boolean d;
        public final int e;
        public final String f;
        public final int g;

        public QnHx(int i, String str, String str2, String str3, boolean z, int i2) {
            this.a = str;
            this.b = str2;
            this.d = z;
            this.e = i;
            int i3 = 5;
            if (str2 != null) {
                String upperCase = str2.toUpperCase(Locale.US);
                if (upperCase.contains("INT")) {
                    i3 = 3;
                } else if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                    i3 = 2;
                } else if (!upperCase.contains("BLOB")) {
                    i3 = (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
                }
            }
            this.c = i3;
            this.f = str3;
            this.g = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || QnHx.class != obj.getClass()) {
                return false;
            }
            QnHx qnHx = (QnHx) obj;
            if (this.e != qnHx.e || !this.a.equals(qnHx.a) || this.d != qnHx.d) {
                return false;
            }
            String str = this.f;
            int i = this.g;
            int i2 = qnHx.g;
            String str2 = qnHx.f;
            if (i == 1 && i2 == 2 && str != null && !str.equals(str2)) {
                return false;
            }
            if (i != 2 || i2 != 1 || str2 == null || str2.equals(str)) {
                return (i == 0 || i != i2 || (str == null ? str2 == null : str.equals(str2))) && this.c == qnHx.c;
            }
            return false;
        }

        public final int hashCode() {
            return (((((this.a.hashCode() * 31) + this.c) * 31) + (this.d ? 1231 : 1237)) * 31) + this.e;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Column{name='");
            sb.append(this.a);
            sb.append("', type='");
            sb.append(this.b);
            sb.append("', affinity='");
            sb.append(this.c);
            sb.append("', notNull=");
            sb.append(this.d);
            sb.append(", primaryKeyPosition=");
            sb.append(this.e);
            sb.append(", defaultValue='");
            return i5.b(sb, this.f, "'}");
        }
    }

    public k05(String str, HashMap map, HashSet hashSet, HashSet hashSet2) {
        this.a = str;
        this.b = Collections.unmodifiableMap(map);
        this.c = Collections.unmodifiableSet(hashSet);
        this.d = hashSet2 == null ? null : Collections.unmodifiableSet(hashSet2);
    }

    public static k05 a(r61 r61Var, String str) {
        HashSet hashSet;
        ArrayList arrayList;
        int i;
        Cursor cursorG = r61Var.g("PRAGMA table_info(`" + str + "`)");
        HashMap map = new HashMap();
        try {
            if (cursorG.getColumnCount() > 0) {
                int columnIndex = cursorG.getColumnIndex(MediationMetaData.KEY_NAME);
                int columnIndex2 = cursorG.getColumnIndex("type");
                int columnIndex3 = cursorG.getColumnIndex("notnull");
                int columnIndex4 = cursorG.getColumnIndex("pk");
                int columnIndex5 = cursorG.getColumnIndex("dflt_value");
                while (cursorG.moveToNext()) {
                    String string = cursorG.getString(columnIndex);
                    map.put(string, new QnHx(cursorG.getInt(columnIndex4), string, cursorG.getString(columnIndex2), cursorG.getString(columnIndex5), cursorG.getInt(columnIndex3) != 0, 2));
                }
            }
            cursorG.close();
            HashSet hashSet2 = new HashSet();
            Cursor cursorG2 = r61Var.g("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int columnIndex6 = cursorG2.getColumnIndex(FacebookAdapter.KEY_ID);
                int columnIndex7 = cursorG2.getColumnIndex("seq");
                int columnIndex8 = cursorG2.getColumnIndex("table");
                int columnIndex9 = cursorG2.getColumnIndex("on_delete");
                int columnIndex10 = cursorG2.getColumnIndex("on_update");
                ArrayList<F1> arrayListB = b(cursorG2);
                int count = cursorG2.getCount();
                int i2 = 0;
                while (i2 < count) {
                    cursorG2.moveToPosition(i2);
                    if (cursorG2.getInt(columnIndex7) != 0) {
                        arrayList = arrayListB;
                        i = count;
                    } else {
                        int i3 = cursorG2.getInt(columnIndex6);
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        for (F1 f1 : arrayListB) {
                            ArrayList arrayList4 = arrayListB;
                            int i4 = count;
                            if (f1.w == i3) {
                                arrayList2.add(f1.y);
                                arrayList3.add(f1.z);
                            }
                            arrayListB = arrayList4;
                            count = i4;
                        }
                        arrayList = arrayListB;
                        i = count;
                        hashSet2.add(new CQf(cursorG2.getString(columnIndex8), cursorG2.getString(columnIndex9), cursorG2.getString(columnIndex10), arrayList2, arrayList3));
                    }
                    i2++;
                    columnIndex6 = columnIndex6;
                    columnIndex7 = columnIndex7;
                    arrayListB = arrayList;
                    count = i;
                }
                cursorG2.close();
                Cursor cursorG3 = r61Var.g("PRAGMA index_list(`" + str + "`)");
                try {
                    int columnIndex11 = cursorG3.getColumnIndex(MediationMetaData.KEY_NAME);
                    int columnIndex12 = cursorG3.getColumnIndex("origin");
                    int columnIndex13 = cursorG3.getColumnIndex("unique");
                    if (columnIndex11 == -1 || columnIndex12 == -1 || columnIndex13 == -1) {
                        cursorG3.close();
                        hashSet = null;
                        break;
                    }
                    hashSet = new HashSet();
                    while (true) {
                        if (!cursorG3.moveToNext()) {
                            cursorG3.close();
                            break;
                        }
                        if ("c".equals(cursorG3.getString(columnIndex12))) {
                            LPt8Fixed lPt8C = c(r61Var, cursorG3.getString(columnIndex11), cursorG3.getInt(columnIndex13) == 1);
                            if (lPt8C == null) {
                                cursorG3.close();
                                hashSet = null;
                                break;
                            }
                            hashSet.add(lPt8C);
                        }
                    }
                    return new k05(str, map, hashSet2, hashSet);
                } catch (Throwable th) {
                    cursorG3.close();
                    throw th;
                }
            } catch (Throwable th2) {
                cursorG2.close();
                throw th2;
            }
        } catch (Throwable th3) {
            cursorG.close();
            throw th3;
        }
    }

    public static ArrayList b(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex(FacebookAdapter.KEY_ID);
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < count; i++) {
            cursor.moveToPosition(i);
            arrayList.add(new F1(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static LPt8Fixed c(r61 r61Var, String str, boolean z) {
        Cursor cursorG = r61Var.g("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = cursorG.getColumnIndex("seqno");
            int columnIndex2 = cursorG.getColumnIndex("cid");
            int columnIndex3 = cursorG.getColumnIndex(MediationMetaData.KEY_NAME);
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                TreeMap treeMap = new TreeMap();
                while (cursorG.moveToNext()) {
                    if (cursorG.getInt(columnIndex2) >= 0) {
                        treeMap.put(Integer.valueOf(cursorG.getInt(columnIndex)), cursorG.getString(columnIndex3));
                    }
                }
                ArrayList arrayList = new ArrayList(treeMap.size());
                arrayList.addAll(treeMap.values());
                return new LPt8Fixed(arrayList, str, z);
            }
            return null;
        } finally {
            cursorG.close();
        }
    }

    public final boolean equals(Object obj) {
        Set<LPt8Fixed> set;
        if (this == obj) {
            return true;
        }
        if (obj == null || k05.class != obj.getClass()) {
            return false;
        }
        k05 k05Var = (k05) obj;
        String str = k05Var.a;
        String str2 = this.a;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        Map<String, QnHx> map = k05Var.b;
        Map<String, QnHx> map2 = this.b;
        if (map2 == null ? map != null : !map2.equals(map)) {
            return false;
        }
        Set<CQf> set2 = k05Var.c;
        Set<CQf> set3 = this.c;
        if (set3 == null ? set2 != null : !set3.equals(set2)) {
            return false;
        }
        Set<LPt8Fixed> set4 = this.d;
        if (set4 == null || (set = k05Var.d) == null) {
            return true;
        }
        return set4.equals(set);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, QnHx> map = this.b;
        int iHashCode2 = (iHashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set<CQf> set = this.c;
        return iHashCode2 + (set != null ? set.hashCode() : 0);
    }

    public final String toString() {
        return "TableInfo{name='" + this.a + "', columns=" + this.b + ", foreignKeys=" + this.c + ", indices=" + this.d + '}';
    }
}
