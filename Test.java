	OnlineResourceItem  item 	= res.getItem(oid);
			final String bid 			= res.id;
			String bn 					= res.name;
			final String svid 			= nextChapter.id;
			final int soid 				= nextChapter.index;
			int count					= res.getItemCount();
			
			//控制下载章节数
			ChapterDownloadUtil.curItem = item;
			
			final OffOnlineDownloadCharge charge = new OffOnlineDownloadCharge(ctx);
			charge.setMaxCount(count);
			charge.setBookName(bn);
			

"hello github,this is the first I used U to submit source code"