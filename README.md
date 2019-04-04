1代码：

public class MainActivity extends AppCompatActivity {
    public static final String TAG="lifecycle";
    private String[] names=new String[]
            {"lion","tiger","monkey","dog","cat","elephant"};
    private String[] des=new String[]
            {"我是狮子","我是老虎","我是猴子","我是狗","我是猫","我是大象"};
    private int[] images=new int[]
            {R.drawable.lion,R.drawable.tiger,R.drawable.monkey,R.drawable.dog,
                    R.drawable.cat,R.drawable.elephant};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Log.d(TAG,"oncreate");
        List<Map<String,Object>> listItems=
                new ArrayList<Map<String,Object>>();
        for(int i=0;i<names.length;i++) {
            Map<String, Object> listItem = new HashMap<String, Object>();
            listItem.put("header", images[i]);
            listItem.put("personName", names[i]);
            listItem.put("desc", des[i]);
            listItems.add(listItem);
        }
        SimpleAdapter simpleAdapter=new SimpleAdapter(this,listItems,
                R.layout.item,new String[]{"header","personName","desc"},
                new int[]{R.id.imageView,R.id.textView,R.id.textView2});
        ListView list=(ListView)findViewById(R.id.listView);
        list.setAdapter(simpleAdapter);
        list.setOnItemClickListener(new OnItemClickListener()
        {
            // 第position项被单击时激发该方法
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id)
            {
                TextView textView= (TextView) view.findViewById(R.id.textView);
                Toast.makeText(MainActivity.this, textView.getText(), Toast.LENGTH_SHORT).show();

            }
        });
    }
    }
    
结果图：

![Image text](https://github.com/tujunkun/shiyan3/blob/master/a1.png)

2代码：

public class Alertdialog extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_main);
        View v;
        v = LayoutInflater.from(this).inflate(R.layout.alertlayout,null);
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setIcon(R.drawable.header_logo);
        builder.setTitle("对话框");
        builder.setView(v);
        builder.setPositiveButton("Sign in",null);
        builder.setNegativeButton( "Cancel",null);
        builder.create();
        builder.show();
}

}

结果图：

![Image text](https://github.com/tujunkun/shiyan3/blob/master/a2.png)

![Image text](https://github.com/tujunkun/shiyan3/blob/master/a3.png)

3代码：


public class MainActivity extends AppCompatActivity {
    public static final String TAG="lifecycle";
    float size[]={40,50,60};
    String color[]={"red","black"};
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"oncreate");
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.my_menu,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
         textView=findViewById(R.id.textView);
        switch (item.getItemId()){
            case R.id.item_1:
            textView.setTextSize(size[0]);
            return true;
            case R.id.item_2:
                textView.setTextSize(size[1]);
                return true;
            case R.id.item_3:
                textView.setTextSize(size[2]);
                return true;
            case R.id.item2:
                Toast.makeText(this, textView.getText(), Toast.LENGTH_SHORT).show();
            case R.id.item3_1:
                textView.setTextColor(getResources().getColor(R.color.colorPrimary));
                return true;
            case R.id.item3_2:
                textView.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                return true;
        }
        return true;
    }
 }
 
 <?xml version="1.0" encoding="utf-8"?>
<menu xmlns:android="http://schemas.android.com/apk/res/android">
    <item android:id="@+id/item"
        android:title="字体大小">
        <menu>
            <item android:id="@+id/item_1"
                android:title="小"></item>
            <item android:id="@+id/item_2"
                android:title="中"></item>
            <item android:id="@+id/item_3"
                android:title="大"></item>
        </menu>
    </item>
    <item android:id="@+id/item2"
        android:title="普通菜单栏"></item>
    <item android:id="@+id/item3"
        android:title="字体颜色">
        <menu>
            <item android:id="@+id/item3_1"
                android:title="紅"></item>
            <item android:id="@+id/item3_2"
                android:title="黑"></item>
        </menu>
    </item>

</menu>

结果图：

![Image text](https://github.com/tujunkun/shiyan3/blob/master/a4.png)
